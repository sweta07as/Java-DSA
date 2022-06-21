import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(isPrime(n));
//        System.out.println(isArmstrong(n));

//      Q3 To print all the three digit armstrong numbers
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i))
                System.out.print(i + " ");
        }
    }

    //Q2 To check Armstrong or Not
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }

    //Q1 To check Prime or Not
    static boolean isPrime(int n){
        if (n <= 1)
            return false;
        int c = 2;
        while (c*c <= n){
            if (n%c == 0)
                return false;
            c++;
        }
        return c * c > n;
    }
}
