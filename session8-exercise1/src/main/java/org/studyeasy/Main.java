package org.studyeasy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Student student = new Student("Bhanupriya.C",1);
        System.out.println("Name : "+student.getName());
        System.out.println("RollNumber :"+student.getRollNumber());
    }
}