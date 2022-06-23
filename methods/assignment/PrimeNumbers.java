//Q13 Write a function that returns all prime numbers between two given numbers.
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int a) {
        if (a<=1)
            return false;
        int c = 2;
        while (c*c <= a){
            if (a%c == 0)
                return false;
            c++;
        }
        return c * c > a;
    }
}
