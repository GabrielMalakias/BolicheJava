package com.github.boliche.controllers;

import com.github.boliche.forms.PlayerForm;
import com.github.boliche.models.Player;
import com.github.boliche.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Random;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService service;

    @Autowired
    public PlayerController(PlayerService service) {
        this.service = service;
    }

    @PostMapping
    public Player create(@Valid @RequestBody PlayerForm form){
        return service.create(form);
    }
}
