//Q7. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        int j = 0, k = 1;
        System.out.println("Fibonacci Series upto " + n + " terms:" );
        System.out.print(j + " " + k);
        for (int i=2; i<n; i++) {

//          first way
            int temp = j + k;
            System.out.print(" " + temp);
            j =k; k = temp;


//            second way
//            int temp = k;
//            k = j + temp;
//            System.out.print(" " + k);
//            j = temp;



        }

    }
}
