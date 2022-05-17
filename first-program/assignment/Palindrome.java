//Q8. To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.next();
        int n = word.length() - 1;
        for (int i=0; i<=n; i++){
            if (word.charAt(i) != word.charAt(n)){
                System.out.println("Not Palindrome");
                return;
            }
            n = n - 1;
            }
        System.out.println("Palindrome");
        }
    }
