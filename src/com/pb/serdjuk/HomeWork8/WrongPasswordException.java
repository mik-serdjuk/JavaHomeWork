package com.pb.serdjuk.HomeWork8;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(boolean result1) {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

}
