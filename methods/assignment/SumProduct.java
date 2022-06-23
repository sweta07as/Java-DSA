// Q4 Write a program to print the sum of two numbers entered by user by defining your own method.
// Q5 Define a method that returns the product of two numbers entered by user.
import java.util.Scanner;

public class SumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
        System.out.println("Product is " + product(a,b));
    }
    static void sum(int a, int b){
        System.out.println("Sum is " + (a+b));
    }
    static int product(int a, int b){
        return a*b;
    }
}
