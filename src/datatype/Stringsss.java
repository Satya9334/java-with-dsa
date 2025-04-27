package datatype;

import java.util.Scanner;

public class Stringsss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter user name:");
        String name= sc.nextLine();


        System.out.println("Enter user age:");
        String age= sc.nextLine();

        System.out.println("Enter user address:");
        String address= sc.nextLine();


        System.out.println("Enter user phone:");
        String phone= sc.nextLine();

        System.out.println("User details are:");
        System.out.println("Name:- "+name);
        System.out.println("Age:- "+age);
        System.out.println("Address:- "+address);
        System.out.println("Phone:- "+phone);
    }
}
