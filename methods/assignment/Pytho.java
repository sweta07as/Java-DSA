//Q12 Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
import java.util.Scanner;

public class Pytho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        System.out.println(triplet(num1, num2, num3));
    }
    static boolean triplet(int a, int b, int c){
        return (a*a)+(b*b) == (c*c);
    }
}
