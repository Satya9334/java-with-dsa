package Conditional;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                                                                    // Question/// Take positive integer input and tell if is even and odd

//        System.out.println("Enter a number");
//        int n= sc.nextInt();
//        if (n%2==0){  // n even hai
//            System.out.println("The number you entered is Even");
//        }
//                                                                  // if (n%2!=0){ //n odd hai ////aise bhi likh sakte hai ya else ka use karenge
//        else {
//            System.out.println("the number you Entered is odd");



/// Take positive integer input and tell if it is divisible by 5 or not
//
//
//        System.out.println("Enter a number:");
//        int n= sc.nextInt();
//        if (n%5==0){
//            System.out.println("Yes it is divisible by 5");
//        }
//        else {
//            System.out.println("Not divisible by 5");
//        }
//


//        System.out.println("Enter the year:");
//        int year= sc.nextInt();
//        if (year %4 == 0){
//            System.out.println("yes it is a leap year");
//        }
//        else {
//            System.out.println("It is not leap year");
//        }
//


        ////chat gpt code///

//        System.out.print("Saal daalein (year): ");
//        int year = sc.nextInt();
//
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println(year + " ek leap year hai.");
//        } else {
//            System.out.println(year + " ek leap year nahi hai.");
//        }
//
//        System.out.println("Enter any integer");
//        int n= sc.nextInt();
//        if (n<0){  // if n is less than zero
//            n = n * (-1);
//        }
//        System.out.println("The absolute value is: "+n);



        ///loss proffit

        // Question > if cost price and selling price of an item is input through the keyboard, write a program to determine Wheather the seller has made profit or incurred loss. also determine how much profit he made or loss he incurred

//        System.out.println("Enter cost price");
//        int cp= sc.nextInt();
//        System.out.println("Enter selling price");
//        int sp= sc.nextInt();
//        if (sp>cp){ //selling price Grater than cost price
//            System.out.print("your proffit is: ");
//            int profit= sp-cp;  //selling price - cost price
//            System.out.println(profit);
//        }
//
//        else {
//            System.out.print("your loss is: ");
//            int loss= cp-sp;  //cost - selling price
//            System.out.println(loss);
//
//        }


/// <<<<<<<<<<<<<<<<<<<<<<<< odd//// even//////////////////<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>


//        int num = sc.nextInt();
//
//        if (num % 2 == 0){
//            System.out.println("Even");
//        }else {
//            System.out.println("odd");
//        }



        ///>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>age group>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.

//        int age = sc.nextInt();
//        if (age<12){
//            System.out.println("child");
//        } else if (age >12 && age < 18) {
//            System.out.println("teenager");
//        } else if (age>18) {
//            System.out.println("Adult");
//        }


        /// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Ternary operator>>>>>>>>>>>>>>>>>>>>>>>>>.//////
/// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.Result show>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.////
//int num = sc.nextInt();
//String ans;
//
//ans = (num % 2==0) ? "Even" : "Odd";
//        System.out.println(ans);

//
//        int value = sc.nextInt();
//        if (value  % 2 == 0 && value % 3 == 0){
//            System.out.println("Found ans -: " + value);
//        }
//
//

        int value = sc.nextInt();
        if (value % 5 == 0 || value % 3 == 0){
            System.out.println("found ans -: " + value);
        }


    }
}
