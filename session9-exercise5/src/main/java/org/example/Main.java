package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Anu",35000);
        Manager manager = new Manager("Anjana",50000,10);
        System.out.println(manager.showDetails());
        System.out.println(employee.showDetails());
    }
}