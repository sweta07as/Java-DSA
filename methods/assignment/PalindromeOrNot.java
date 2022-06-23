//Q10 Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(palindrome(num));
    }

    static boolean palindrome(int num){
        int temp = num;
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            num = num/10;
            rev = rev*10 + rem;
        }
        return rev == temp;
    }
}
