package com.github.boliche.models;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Builder(toBuilder = true)
public class Player {
    @NonNull
    @Getter
    private final long id;

    @NonNull
    @Getter
    private final String name;

    @JsonCreator
    public Player(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
