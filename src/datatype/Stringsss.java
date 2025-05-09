package datatype;

import java.util.Scanner;

public class Stringsss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter user name");
        String name= sc.nextLine();
        System.out.println("Enter your  age");
        String age = sc.nextLine();
        System.out.println("Enter your phone");
        String phone= sc.nextLine();
        System.out.println("Enter you Address");
        String Address= sc.nextLine();


        System.out.println("Enter user details");
        System.out.println("Name:- "+name );
        System.out.println("Age:- "+age);
        System.out.println("Phone:- "+phone);
        System.out.println("Address:- "+Address);

    }
}
