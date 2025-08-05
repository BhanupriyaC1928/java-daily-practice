package org.studyeasy.animals.reptiles;

import org.studyeasy.animals.Animal;

public class Reptiles extends Animal {
    protected String skin, egg;
    protected boolean backbone;

    public Reptiles() {
        heighInFeet = 5;
        weightInKilos =20;
        animalType = "Reptiles";
        bloodType = "cold blooded";
        this.skin = "dry skin";
        this.egg = "soft shelled";
        this.backbone = true;
    }

    public String showInfo() {
        return "Reptiles{" +
                "skin='" + skin + '\'' +
                ", egg='" + egg + '\'' +
                ", backbone=" + backbone +
                '}';
    }
}
