package org.example;

public class Employee {
    private int empid;
    private String name;
    private int salary;
    private String dept;

    public Employee(int empid, String name, int salary, String dept) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary>10000) {
            this.salary = salary;
        }
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void empInfo() {
        System.out.println("*************Employee Details*************");
        System.out.println("Employee Id : " +empid +"\n"+ "Employee Name : "+name +"\n" +"Annual Salary : "+salary*12 +"\n" +"Department : "+dept);
    }
}
