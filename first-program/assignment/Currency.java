//Q6. Input currency in rupees and output in USD.
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency in Rupees: ");
        int rs = sc.nextInt();
        float usd = 0.013f * rs;
        System.out.println(rs + " Rupees is " + usd + " USD");

    }
}
