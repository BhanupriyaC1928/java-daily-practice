package org.example;

public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public String showDetails() {
        return "Manager{" +
                "teamSize=" + teamSize +
                "} " + super.showDetails();
    }
}
