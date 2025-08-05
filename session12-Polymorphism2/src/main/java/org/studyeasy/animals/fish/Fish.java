package org.studyeasy.animals.fish;

import org.studyeasy.animals.Animal;

public class Fish extends Animal {
    private boolean waterBone = true;
    private boolean gills = true;

    public Fish() {
        animalType = "fish";
        this.waterBone = true;
        this.gills = true;
    }

    public String showInfo() {
        return "Fish{" +
                "waterBone=" + waterBone +
                ", gills=" + gills +
                '}';
    }
}
