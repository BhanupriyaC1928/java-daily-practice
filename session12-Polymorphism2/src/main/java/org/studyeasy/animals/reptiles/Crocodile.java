package org.studyeasy.animals.reptiles;

public class Crocodile extends Reptiles {
    public Crocodile() {
        super();
        egg = "hard shelled";
    }

    @Override
    public String showInfo() {
        return "Crocodile{}";
    }
}
