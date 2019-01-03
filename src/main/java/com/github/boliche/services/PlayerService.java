package com.github.boliche.services;

import com.github.boliche.forms.PlayerForm;
import com.github.boliche.models.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
public class PlayerService implements Service<PlayerForm, Player> {
    private final ConversionService converter;

    @Autowired
    public PlayerService(ConversionService converter) {
        this.converter = converter;
    }

    @Override
    public Player create(PlayerForm model) {
        return converter.convert(model, Player.class);
    }
}
