package ru.netology.javaqa;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String s) {
        super("Player with name: " + s + " not found");
    }
}
