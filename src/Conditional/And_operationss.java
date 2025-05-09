package Conditional;

import java.util.Scanner;

public class And_operationss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int n= sc.nextInt();
//        if (n>99 && n<1000){
//            System.out.println("This is a 3 digit number");
//        }
//        else {
//            System.out.println("It is a not 3 digit number");
//        }

              ///////////// only print 2 digit number

//        System.out.println("Enter a number");
//        int m= sc.nextInt();
//        if (m>10 && m<55){
//            System.out.println("This is a 2 digit number");
//        }
//        else {
//            System.out.println("It is a not 2 digit number");
//        }



        /// //// division rule 5 and 3


        //// Check if the number is divisible by 5 and  3

//        System.out.println("Enter a number");
//        int n= sc.nextInt();
//        if (n%5==0 && n%3==0){
//            System.out.println("The number is divisible by 5 and 3 ");
//        }
//        else {
//            System.out.println("Not divisible by 5 and 3 ");
//        }


        //// Check if the number is divisible by 5 but not by 3

//        System.out.print("Enter a number: ");
//        int number = sc.nextInt();  /// Read the user input
//
//        // Check if the number is divisible by 5 but not by 3
//        if (number % 5 == 0 && number % 3 != 0) {
//            System.out.println("The number is divisible by 5 but not by 3.");
//        } else {
//            System.out.println("The number does not meet the condition.");
//        }

               ///  check if The number is divisible by  either 3 and 5

//        System.out.println("Enter a number");
//        int n= sc.nextInt();
//        if (n%5==0 || n%3==0){
//            System.out.println("The number is divisible by  either 3 and 5 ");
//        }
//        else {
//            System.out.println("Not divisible by  either 3 and 5 ");
//        }

//

         ///  chose  largest number

//        System.out.println("Enter first number");
//        int a= sc.nextInt();
//
//        System.out.println("Enter second number");
//        int b= sc.nextInt();
//
//        System.out.println("Enter third number");
//        int c= sc.nextInt();
//
//       if (a>b && a>c){
//           System.out.println( a + " is largest ");
//       }
//        else if (b>c && b>c) {
//            System.out.println(b + " is largest ");
//
//        }
//        else{
//            System.out.println(c + " is largest ");
//
//        }


            /// Triangle side

        System.out.println("Enter first side");
        int a= sc.nextInt();

        System.out.println("Enter second side");
        int b= sc.nextInt();

        System.out.println("Enter third side");
        int c= sc.nextInt();

        if (a+b>c && c+b>a && a+c>b){
            System.out.println( a + " Valid triangle ");
        }
        else {
            System.out.println("Invalid triangle");
        }












    }
}
