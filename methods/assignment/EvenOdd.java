import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        System.out.println("Number is " + evenOdd(a));
    }
    static String evenOdd(int num){
        if (num%2 == 0)
            return "even";
        else
            return "odd";
    }
}
