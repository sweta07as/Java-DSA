//Q3. Write a program to input principal, time, and rate (P, T, R) from the user
// and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        int P = sc.nextInt();
        System.out.print("Enter time: ");
        float T = sc.nextFloat();
        System.out.println("Enter rate: ");
        float R = sc.nextFloat();
        System.out.println("Simple Interest is " + P*R*T / 100);


    }
}
