package Loops;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

     ///   int sum = 0;

//        for (int num = 1; num <= n; num++){

///      //   sum = sum+num;

//            System.out.println(num);

//        }
      ///  System.out.println(" sum of number upto n "+ sum);


        for (int num=n; num >=1; num--){
            System.out.println(num);
        }

    }
}
