package ru.netology.javaqa;

import java.util.Objects;

public class Player {
    private int id;
    private String name;

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    private int strength;

}
