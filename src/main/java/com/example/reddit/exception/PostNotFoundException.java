package com.example.reddit.exception;

public class PostNotFoundException extends RuntimeException  {
    public PostNotFoundException(String message) {
        super(message);
    }
}
