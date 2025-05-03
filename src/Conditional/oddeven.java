package Conditional;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        if (n%2==0){  // n even hai
            System.out.println("The number you entered is Even");
        }
        if (n%2!=0){ //n odd hai
            System.out.println("the number you Entered is odd");

        }

    }
}
