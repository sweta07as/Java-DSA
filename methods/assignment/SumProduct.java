import java.util.Scanner;

public class SumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum is " + sum(a,b));
        System.out.println("Product is " + product(a,b));
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int product(int a, int b){
        return a*b;
    }
}
