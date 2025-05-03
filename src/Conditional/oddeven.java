package Conditional;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        if (n%2==0){  // n even hai
            System.out.println("The number you entered is Even");
        }

       // if (n%2!=0){ //n odd hai ////aise bhi likh sakte hai ya else ka use karenge

        else {
            System.out.println("the number you Entered is odd");

        }

    }
}
