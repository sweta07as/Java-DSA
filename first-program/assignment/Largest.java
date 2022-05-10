//Q5. Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b)
            System.out.println("Largest number is " + a);
        else
            System.out.println("Largest number is " + b);

    }
}
