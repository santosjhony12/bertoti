package com.apiToDoList.demo.exception;

public class EntityNotFoundExcepition extends RuntimeException {
    public EntityNotFoundExcepition(String message) {
        super(message);
    }
}
