package Conditional;

import java.util.Scanner;

public class Nested_if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int n= sc.nextInt();
//        if (n%5==0 || n%3==0){
//            if (n%15!=0){
//                System.out.println("The number is divisible by 5 and 3 both");
//            }
//            else {
//                System.out.println("Not Matching the required condition");
//            }
//
//            }
//        else {
//            System.out.println("Not Matching the required condition");
//        }


//        System.out.println("Enter first number:");
//        int a= sc.nextInt();
//        System.out.println("Enter second number");
//        int b= sc.nextInt();
//        System.out.println("Enter third number:");
//        int c= sc.nextInt();
//
//        if (a>b){
//            if (a>c){
//                System.out.println(a+ " is largest");
//            }
//            else {
//                System.out.println(c + "  is largest");
//            }
//
//        }
//        else {
//            if (b>c){
//                System.out.println(b + "is largest");
//            }
//            else {
//                System.out.println(c + " is largest");
//        }
 //
//        }




        System.out.println("Enter  First Age:");
        int aman= sc.nextInt();
        System.out.println("Enter Second Age:");
        int satya= sc.nextInt();
        System.out.println("Enter Third Age:");
        int rahul= sc.nextInt();
        if (aman>satya){
           if (aman>rahul){
               System.out.println(aman+ " aman is youngest");
           }
           else {
               System.out.println(rahul+ " rahul is youngest");
           }
        } else if (satya>rahul) {
            System.out.println(satya+ "satya is youngest");
        }
else {
            System.out.println(rahul+ "rahul is youngest");
        }
    }



}
