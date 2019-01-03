package com.github.boliche.forms;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;

public class PlayerForm {
    @Getter
    private final long id;

    @NotBlank
    @Size(min = 2, max = 250)
    @Getter
    private final String name;

    @JsonCreator
    public PlayerForm(@JsonProperty("id") long id,
                      @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }
}
