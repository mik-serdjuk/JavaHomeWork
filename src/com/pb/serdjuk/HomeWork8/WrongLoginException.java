package com.pb.serdjuk.HomeWork8;

public class WrongLoginException extends Exception {
    public WrongLoginException(boolean result) {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
