package org.studyeasy.animals.bird;

import org.studyeasy.animals.Animal;

public class Birds extends Animal {
    protected boolean hasFeathers =true;
    protected boolean canFly=true;

    @Override
    public String showInfo() {
        return "Birds{" +
                "hasFeathers=" + hasFeathers +
                ", canFly=" + canFly +
                '}';
    }
}
