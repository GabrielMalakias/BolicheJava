package com.github.boliche.requests;

import com.github.boliche.models.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CreatePlayerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void createPlayerShouldCreateANewEntry() throws Exception {
        Player p = Player.builder()
                .id(new Random().nextInt())
                .name("Boliche")
                .build();

        HttpEntity<Player> request = new HttpEntity<>(p);

        Player response = restTemplate.postForObject(getUri(), request, Player.class);

        assertThat(response.getId()).isNotNull();
        assertThat(response.getName()).isEqualTo("Boliche");
    }

    private String getUri(){
        return new StringBuilder()
                .append("http://localhost:")
                .append(port)
                .append("/players")
                .toString();
    }
}
