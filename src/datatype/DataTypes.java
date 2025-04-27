package datatype;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
//        int a=5;
//        int b=5;
//        int sum = a+b;
//        System.out.println(sum);

//
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter first number:");
//        int num_1 = sc.nextInt();
//
//        System.out.println("Enter second number:");
//        int num_2 = sc.nextInt();
//
//
//        int add=num_1+num_2;
//        System.out.println("Your sum is:- "+add);
//
//
//        int sub =num_1-num_2;
//        System.out.println("Your substraction is:- "+sub);
//
//
//        int mul = num_1*num_2;
//        System.out.println("Your multiplication is:- "+mul);
//
//        int div = num_1/num_2;
//        System.out.println("Your division is:- " +div);
//

//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter first num:");
//        int a= sc.nextInt();
//
//
//        System.out.println("Enter second num:");
//        int b= sc.nextInt();
//        int sum= a+b;
//        System.out.println("Sum:- "+sum);
//



        Scanner sc=new Scanner(System.in);

        System.out.println("Enter principle:-");
        Float p= sc.nextFloat();


        System.out.println("Enter rate of interest:-");
        Float r= sc.nextFloat();

        System.out.println("Enter time:-");
        Float t= sc.nextFloat();

        Float si=(p*r*t)/100;

        System.out.println("Principle:- "+p);
        System.out.println("Rate:- "+r);
        System.out.println("Time:- "+t);

        System.out.println("Simple interest:- "+ si);






    }
}
