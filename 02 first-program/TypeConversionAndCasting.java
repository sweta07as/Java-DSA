import java.util.Scanner;
// conditions for Automatic Type Conversion
// 1) two types should be compatible
// 2) destination type should be greater than the source type i.e., LHS should be greater than RHS

public class TypeConversionAndCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

//Java also performs Automatic Type Conversion when storing an integer variable with constant of type byte, short, long
//and even char sometimes (by taking the ASCII Value of Char)
        int number = 'a';
//        System.out.println(number);


        // type casting //narrowing conversion //for incompatible types
        //compressing bigger number into smaller type explicitly
        int num = (int) (67.56f);  //truncates the decimal part, meaning that it cuts it off without doing any rounding
        //System.out.println(num)


//        int a = 257;
//        byte b = (byte)(a); //257 % 256 = 1

        //automatic type promotion in expressions
          byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c; //in RHS, the byte expressions are converted into int by automatic type promotion
//      System.out.println(d);

//        byte b = 50;
//        b = b * 2;
        //gives error since RHS's integer can't be assigned to LHS's byte automatically.


        //Rules for Type Promotion
        //1) All the byte, short and char values are promoted to integer.
        //2) In the expression, if any operand is of type long, then whole is promoted to long. Same goes with float
        //and double

//        System.out.println(3 * 5.6f); //gives float

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d =  0.1234;
        double result = (f*b) + (i/c) - (d*s);
        System.out.println((f*b) + " " + (i/c) + " " + (d*s));
        System.out.println(result); //float + int - double = double

        //Java follows Unicode principles
        // for example
//        System.out.println("नमस्ते");
//        System.out.println("你好");



    }
}
