//intermediate //Q3 Calculate Average Of N Numbers
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        float sum = 0;
        System.out.println("Enter the " + n + " values:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        float avg = sum/n;
        System.out.println("Average of " + n + " numbers is " + (avg));
    }
}
