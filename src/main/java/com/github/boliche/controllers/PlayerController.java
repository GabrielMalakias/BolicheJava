package com.github.boliche.controllers;

import com.github.boliche.models.Player;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping(value = "/players", produces = MediaType.APPLICATION_JSON_VALUE)
public class PlayerController {

    @PostMapping
    @ResponseBody
    public Player create(){
        return Player.builder()
                .id(new Random().nextInt())
                .name("Boliche")
                .build();
    }
}
