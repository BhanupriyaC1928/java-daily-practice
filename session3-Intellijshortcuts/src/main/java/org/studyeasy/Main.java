package org.studyeasy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i = 0;
        display("This is intellij");
        display("This is intellij");
        display("This is intellij");
        display("This is intellij");
    }

    public static void display(String param) {
        System.out.println(param);
    }
    //go to setting and change the code color
    //debugging steps

    //1.without parameter
//    public static void main(String[] args) {
//       loop1();
//        System.out.println("************************************");
//        loop2();
//    }
//    public static void loop1(){
//        for (int i=1;i<=10;i+=2){
//            System.out.println(i);
//        }
//    }
//    public static void loop2(){
//        for (int i=0;i<=10;i+=2){
//            System.out.println(i);
//        }
//    }

    // 2. with parametr
//    public static void main(String[] args) {
//        loop(1,5);
//        System.out.println("************************************");
//        loop(10,15);
//    }
//    public static void loop(int start, int end){
//        for (;start<=end;start++){
//            System.out.println(start);
//        }
//    }

    //3. return in method
//    public static void main(String[] args){
//      int area = areaOfRectangle(10, 15);
//        System.out.println(areaOfRectangle(10, 15));
//    }
//     public static int areaOfRectangle(int height, int width){
//        return height * width;
//     }

//****************** Method Overloading in java.***********************
//method overloading : Method overloading is a feature in Java that allows a class to have more than one method with the same name
//but   Methods must have the same name
//      Methods must differ by:
//    Number of parameters, or
//    Type of parameters, or
//    Order of parameters (if types are different)

    //1.
// public static void main(String[] args){
//     System.out.println("area of rectangle "+area(3, 4));
//     System.out.println("area of shape "+area(2));
//     System.out.println("area of square "+area(3));
// }
// public static int area(int height,int width){
//     return height*width;
// }
//    public static double area(double width,int height){
//        return width*height;
//    }
// public static double area(double side){
//        return pow(side, 2);
// }
// public static int area(int side){
//        return side*side;
// }

    //2.
//    public static void main(String[] args) {
//        sum(2, 3);
//        sum(2.1f, 2.2f);
//        sum(2.1, 2);
//        sum(2, 2.2);
//    }
//
//    //number of parameter
//    public static void sum(int x, int y) {
//        System.out.println("sum of 2 int value " + (x + y));
//    }
//
//    //Type of parameter
//    public static void sum(float x, float y) {
//        System.out.println("sum of 2 float value " + (x + y));
//    }
//
//    public static void sum(double x, int y) {
//        System.out.println("sum of double & int value " + (x + y));
//    }
//
//    public static void sum(int x, double y) {
//        System.out.println("sum of int & double value " + (x + y));
//    }
  //alt+shift+ctrl+L => code indentation
    //literals in java =>null, true,false
//    public static void main(String[] args) {
//        System.out.println("hello\n there");//for nextLine
//        System.out.println("hello\t there");//for tab
//        System.out.println("hello\bthere");//for backspace o is removed
//        System.out.println("hello \\ there"); // for displaying backslashes
//        System.out.println("hello \" \" there"); // for displaying quotes
//        int x=0100;
//        System.out.println(x); // if we add 0 in front of a number it will consider as octal so o/p : 64
//        int x=0X64;
//       System.out.println(x); // to getting hexadecimal equavalent of 64, o/p :100
//        int x=0b100;
//        System.out.println(x); // to getting binary value

    }
//}