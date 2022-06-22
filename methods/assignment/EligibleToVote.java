import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + vote(age));
    }

    static String vote(int age){
        if (age>= 18)
            return "eligible to vote";
        else
            return "not eligible to vote";
    }
}
