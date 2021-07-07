package io.zipcoder.polymorphism;

public class Pigeon extends Pet{
    public Pigeon(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "Coo!";
    }
}
