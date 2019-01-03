package com.github.boliche.services;

public interface Service<T, U> {
    U create(T model);
}
