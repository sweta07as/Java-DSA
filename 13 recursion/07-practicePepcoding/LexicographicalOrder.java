import java.util.Scanner;

public class LexicographicalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            lexico(i, n);
        }

    }

    public static void lexico(int i, int n) {
        if(i > n){
            return;
        }
        System.out.println(i);
        for (int j = 0; j < 10; j++) {
            lexico(10*i + j, n);
        }
    }


}
