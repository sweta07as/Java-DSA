//Q7 Define a method to find out if a number is prime or not.
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        isPrime(num);
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
