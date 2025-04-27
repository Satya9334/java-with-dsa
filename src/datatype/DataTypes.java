package datatype;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
//        int a=5;
//        int b=5;
//        int sum = a+b;
//        System.out.println(sum);


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int num_1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num_2 = sc.nextInt();


        int add=num_1+num_2;
        System.out.println("Your sum is:- "+add);


        int sub =num_1-num_2;
        System.out.println("Your substraction is:- "+sub);


        int mul = num_1*num_2;
        System.out.println("Your multiplication is:- "+mul);

        int div = num_1/num_2;
        System.out.println("Your division is:- " +div);



    }
}
