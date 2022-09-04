//Q4. Take in two numbers and an operator (+, -, *, /) and calculate the value.(Use if conditions)

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter operator: ");
        char c = sc.next().charAt(0);
        if (c == '+')
            System.out.println("Sum = " + (a+b) );
        if (c == '-')
            System.out.println("Difference = " + (a-b) );
        if (c == '*')
            System.out.println("Product = " + (a*b) );
        if (c == '/')
            System.out.println("Quotient = " + (a/b) );
    }
}
