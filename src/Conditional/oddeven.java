package Conditional;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
                                                                    // Question/// Take positive integer input and tell if is even and odd
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n= sc.nextInt();
//        if (n%2==0){  // n even hai
//            System.out.println("The number you entered is Even");
//        }
//
//                                                                  // if (n%2!=0){ //n odd hai ////aise bhi likh sakte hai ya else ka use karenge
//
//        else {
//            System.out.println("the number you Entered is odd");



/// Take positive integer input and tell if it is divisible by 5 or not


        System.out.println("Enter a number:");
        int n= sc.nextInt();
        if (n%5==0){
            System.out.println("Yes it is divisible by 5");
        }
        else {
            System.out.println("Not divisible by 5");
        }

    }
}
