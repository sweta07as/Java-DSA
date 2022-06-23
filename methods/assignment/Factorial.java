//Q9 Write a program to print the factorial of a number by defining a method named 'Factorial'. 
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    static int factorial(int n){
        int product = 1;
        for (int i = 0; i < n; i++) {
            product = product * n;
            n--;
        }
        return product;
    }
}
