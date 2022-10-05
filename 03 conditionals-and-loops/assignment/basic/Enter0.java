//Q24 Take integer inputs till the user enters 0 and print the sum of all numbers
//Q25 Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class Enter0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        int largest = num;
        while (num != 0) {
            sum += num;
            num = sc.nextInt();
            if (num>largest)
                largest = num;
        }
        System.out.println("Sum of all numbers is " + sum);
        System.out.println("The largest number is " + largest);
    }
}
