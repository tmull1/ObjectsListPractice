package org.example;

public class Animal {
    private String name;
    private boolean isDog;

    // Constructor
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Getters
    public String getName() {
        return name;
    }

    public boolean getIsDog() {
        return isDog;
    }

    // toString method
    @Override
    public String toString() {
        return name + " is a dog = " + isDog;
    }
}

