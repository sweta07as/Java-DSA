import java.util.Scanner;

//when you DON'T know how many times the loop is going to run, use the WHILE loop
//when you know how many times the loop is going to run, use the FOR loop

public class Loops {
    public static void main(String[] args) {
        // Q: Print odd numbers from 1 to 5
//        for (int num = 1; num<=5; num +=2){
//            System.out.println(num);
//        }

        // Q: Print numbers from 1 to n
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//        }

        //while loop
        int num = 1;
        while (num<=5){
//            System.out.println(num);
            num += 2;
        }
        //do while
        int n = 1;
        do {
            System.out.println("Hello World");
        } while (n != 1);
    }
}
