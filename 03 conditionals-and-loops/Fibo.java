//Q: Find the nth Fibonacci Number
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        int a = 0, b = 1;

        //first way //while //more cleaner code
        int count = 2;
        while (count <=n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }


      //second way //for //less cleaner code
//        for (int i=2; i<=n; i++) {
//            int temp = a + b;
//            a = b;
//            b = temp;
//        }

        System.out.println("The " + n + "th Fibonacci Number is " + b);
    }
}
