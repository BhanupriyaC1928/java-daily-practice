package org.studyeasy.animals.fish;

public class Eel extends Fish {
    protected String special;

    public Eel() {
        super();
        this.special = "release electric stock";
    }

    @Override
    public String showInfo() {
        return "Eel{" +
                "special='" + special + '\'' +
                '}';
    }
}
