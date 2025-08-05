package org.example;

public class Student extends Person{
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String introduce() {
        return "Hi, I'm " + getName() +" and I'm "+ getAge() + "years old and I study in grade "+grade;
    }
}
