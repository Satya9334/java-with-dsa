package Conditional;

import java.util.Scanner;

public class Apriori {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter length:");
            int length= sc.nextInt();
            System.out.println("Enter breadth:");
            int breadth= sc.nextInt();
            int area= length*breadth;
            int perimeter= 2*(length+breadth);

            if (area>perimeter){
                System.out.println("area is gheater than perimeter");
            }
            else {
                System.out.println("perimeter is greater then area");
            }
    }
}
