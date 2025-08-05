package org.example;

public class Employee {
    private String name;
    private  int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String showDetails() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
