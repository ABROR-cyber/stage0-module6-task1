package com.epam.mjc.stage0;

public class Bird extends Animal{

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        String description = super.getDescription();
        return description+" Moreover, it has 2 wings and can fly.";
    }
}
