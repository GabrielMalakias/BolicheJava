package com.github.boliche.converters;

import com.github.boliche.forms.PlayerForm;
import com.github.boliche.models.Player;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PlayerFormToPlayer implements Converter<PlayerForm, Player> {
    @Override
    public Player convert(PlayerForm playerForm) {
        return Player
                .builder()
                .id(playerForm.getId())
                .name(playerForm.getName())
                .build();
    }
}
