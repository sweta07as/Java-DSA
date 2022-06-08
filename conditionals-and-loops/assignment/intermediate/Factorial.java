//intermediate //Q1 Factorial Program
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fac = 1;
        while(num>=1){
            fac = num*fac;
            num = num - 1;
        }
        System.out.println(fac);
    }
}
