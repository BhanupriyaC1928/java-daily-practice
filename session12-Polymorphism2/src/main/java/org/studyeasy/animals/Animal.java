package org.studyeasy.animals;

public class Animal {
    protected float heighInFeet;
    protected float weightInKilos;
    protected String animalType;
    protected String bloodType;

    public Animal() {
        this.heighInFeet =0;
        this.weightInKilos =0;
        this.animalType = "unknown";
        this.bloodType = "unknown";
    }

    public String showInfo() {
        return "Animal{" +
                "heighInFeet=" + heighInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
