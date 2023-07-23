package com.epam.OOP;

public class Bird extends Animal {
    private final String EXTRA_BIRD_DESCRIPTION = " Moreover, it has 2 wings and can fly.";

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + EXTRA_BIRD_DESCRIPTION;
    }
}