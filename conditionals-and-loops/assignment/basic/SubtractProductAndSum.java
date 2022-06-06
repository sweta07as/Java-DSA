//For Q21, go to assignment of first-program folder
//basic //Q22 Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int product = 1, sum = 0;
        while (num>0){
        int rem = num % 10;
        sum += rem;
        product *= rem;
        num = num/10;
        }
        System.out.println(product - sum);
    }
}
