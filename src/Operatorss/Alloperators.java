package Operatorss;

public class Alloperators {
    public static void main(String[] args) {


        ///////// Arithemeic operators//////////////////

//        int p=20,q=10;
//        System.out.println(p+q); //Addition
//        System.out.println(p-q); //subtraction
//        System.out.println(p*q); //multiplication
//        System.out.println(p/q); //division
//        System.out.println(p%q); //module

        /////// //Relational operators/////////////
//        int i=5,j=7;
//        System.out.println(i==j); //is Equal to
//        System.out.println(i!=j); //Not Equal to
//        System.out.println(i>j);  //Greater than
//        System.out.println(i<j);  //Less than
//        System.out.println(i>=j); //Greater than Equal
//        System.out.println(i<=j); //Less than Equal
//

        /// //////////logical operators/////////

        /// Logical AND operators
//         int a=15, b=13,c=9;
//        System.out.println((a>b) && (a>c)); // Logical AND operators

        //// Logical OR operators
//        int p=10, q=8,r=15;
//        System.out.println((p>q)||(p>r)); // True

        ////// Not operators
//        int x=50,y=50,z=70;
//        System.out.println(!(x==y));  //false
//        System.out.println(!(y==z));  //True


        ///Assignment operators

//        int p =10;
//        int q;
//
//        ///=
//        q = p;
//        System.out.println(q); // 10
//
//        /// +=
//        p+=q; //p=p+q;  // p = 10+10 =20;
//        System.out.println(p);   // 20
//
//        /// -=
//        p-=q; //p=p-q;  p=10-10;
//        System.out.println(p);  //20 -10 =10
//
//        /// *=
//        p*=q; // p=p*q; // p=10*10 = 100
//        System.out.println(p);
//
//
//        /// /=
//        p/=q; // p=p/q // p=10 /10
//        System.out.println(p);
//
//          /// %=
//        p%=q; // p=p%q //p=10%10
//        System.out.println(p);


        ///  unary operator
//        int a=5, b=5;
//
//        System.out.println(a++); //5
//        System.out.println(a); //6
//
//        System.out.println(++b); //6
//        System.out.println(b); //6
//
//        int x = a++;
//        int y = ++b;
//
//        System.out.println(x); //6
//        System.out.println(y); //7
//
//        System.out.println(a); //7
//        System.out.println(b); //7



        int p=9, q=10;
        System.out.println(p | q); /// use the bitwise OR operator convert to binary number 9,10 ->//result 11
        System.out.println(p & q);  /// use the bitwise AND operator  convert to binary number 9,10 ->//Result 8
        System.out.println(p ^ q);  /// use the bitwise  XOR  operator  convert to binary number 9,10 ->//Result  3


        ///Bitwise complement operator using
        System.out.println(p<<1);  ///  Left shift << Bitwise operator change to one bits shift left side 9<<1 = Result 18
        System.out.println(p<<2);  /// Left shift << Bitwise operator change to Two bits shift left side 9<<2 = Result 36


        System.out.println(q>>1);  /// Right shift >> Bitwise operator change to One bits shift left side 10>>1 = Result 5

        System.out.println(q>>2);  /// /// Right shift >> Bitwise operator change to Two bits shift left side 10>>2 = Result 2

    }
}
