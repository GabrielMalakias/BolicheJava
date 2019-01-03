package com.github.boliche.models;

import lombok.*;

@Builder(toBuilder = true)
public class Player {
    @NonNull
    @Getter
    private final long id;

    @NonNull
    @Getter
    private final String name;
}
