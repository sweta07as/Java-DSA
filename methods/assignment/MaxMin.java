//Q1 Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Maximum number among the entered three numbers is " + max(a,b,c));
        System.out.println("Minimum number among the entered three numbers is " + min(a,b,c));
    }
    static int max(int a, int b, int c){
       int max = a;
       if (b>max)
           max = b;
       if (c>max)
           max = c;
       return max;
    }

    static int min(int a, int b, int c){
        int min = a;
        if (b<min)
            min = b;
        if (c<min)
            min = c;
        return min;
    }
}
