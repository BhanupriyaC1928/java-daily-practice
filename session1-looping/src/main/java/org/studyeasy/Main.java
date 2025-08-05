package org.studyeasy;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //For loop

//     for(int i=1; i<=10;i++){
//         System.out.println(i);
//     }
        //
//        int i=5;
//        for(i=0;i<10;i++){
//            System.out.println(i);
//        }
//        System.out.println(i);

//        for(int i=0, j=0; (i<=10)&&(j<=10);i++, j++ ){
//            System.out.println("the value of i & j :" +i  +">>"  +j);
//        }

         //for each loop:

//        int x[]={1, 3, 5, 7};
//        for (int temp : x){
//            System.out.println(temp);
//        }
        //while loop

//        while (true){
//            System.out.println("Infinite loop");
//        }

//        int x=0;
//         while(x<10){
//             System.out.println(x);
//             x++;
//         }

        //do while:
//        int x=0;
//       do {
//             System.out.println(x);
//             x++;
//         }while(x<10);
//    nested loop
        //pattern matching rightangle triangle
//    for(int i=0; i<5;i++){
//        for(int j=0; j<5; j++){
//            if(i>=j) {
//                System.out.print("@");
//            }
//            else{
//                System.out.print(" ");
//            }
//        }
//        System.out.println( );
//    }
        //sum of individual digits i/p :1234 o/p : 1+2+3+4
//        int num = 123;
//        int sum=0;
//        while (num!=0){
//            sum =sum+num%10;
//            num=num/10;
//        }
//        System.out.println(sum);
        //1. check even or odd
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        if(num%2==0){
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }
        //2. print all numbers from 1 to n
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        for(int i=1;i<=num;i++){
//            System.out.println(i);
//        }
        //3. print sum of all numbers from 1 to n
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int sum=0;
//        for(int i=1;i<=num;i++){
//           sum+=i;
//        }
//        System.out.println(sum);
        //4.palindrome or not
//        int num=121;
//        int temp=num;
//        int rev = 0;
//        while(num!=0){
//            rev =rev*10+num%10;
//            num = num/10;
//        }
//        if(temp==rev){
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("not a polindrome");
//        }
        //5. rightAngle triangle
//        for(int i=0;i<4;i++){
//            for(int j=0; j<4;j++){
//                if(i>=j){
//                    System.out.print("*");
//                }
//            }
//            System.out.println( );
//        }
//        //6. tables
//        int num=5;
//        for(int i=1;i<=10;i++){
//            System.out.println(num +"*"+ i +"="+num*i);
//        }
        //7. prime or not;
//        int num =1;
//        int flag =0;
//        if(num==1) {
//            System.out.println("special case");
//        }else {
//            for (int i = 2; i < num; i++) {
//                if (num % i == 0) {
//                    flag += 1;
//                }
//            }
//            if (flag == 0) {
//                System.out.println("prime " + flag);
//            } else {
//                System.out.println("not a prime " + flag);
//            }
//        }
        //8. count the number of digits in a number
//        int num=4890;
//        int length=0;
//        while(num>0){
//             num/=10;
//             length++;
//            }
//        System.out.println(length);
        //9. factorial of a number
//           int n=3;
//           int fact=1;
//           for(int i=1; i<=n;i++){
//               fact*=i;
//           }
//        System.out.print(fact);
        //10. reverse the digits of a number
        int num=123;
        int rev=0;
        while(num!=0){
            rev = rev*10+num%10;
            num/=10;
        }
        System.out.println(rev);
        }

    }

