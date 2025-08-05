package org.studyeasy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("multiplies two integers : "+multiply(2,5));
        System.out.println("multiplies three integers : "+multiply(2,5,3));
        System.out.println("multiplies two doubles : "+multiply(2.1,2.2 ));
    }
    public static int multiply(int a, int b){
     return  a*b;
    }
    public static int multiply(int a, int b, int c){
        return  a*b*c;
    }
    public static double multiply(double x, double y){
        return x*y;
    }
}