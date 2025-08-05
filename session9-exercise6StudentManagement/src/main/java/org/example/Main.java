package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name :");
     String name = scanner.next();
        System.out.println("age : ");
     int age = scanner.nextInt();
        System.out.println("grade : ");
     int grade = scanner.nextInt();
     Person person = new Person(name,age);
        System.out.println(person.introduce());
        Student student = new Student(name, age, grade);
        System.out.println(student.introduce());
    }
}