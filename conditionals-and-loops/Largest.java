// Q: Find the largest of the three numbers.
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //first way
//        int max = a;
//        if (b > max)
//            max = b;
//        if (c > max)
//            max = c;
//        System.out.println("Largest number is "+ max);

        //second way
// if negative integer values are inputted, then this method won't give correct results.
// In that case, it will give 0 which will be incorrect
//        int max = 0;
//        if (a>b)
//            max = a;
//        else
//            max = b;
//        if (c>max)
//            max = c;
//        System.out.println("Largest number is "+ max);

        //third way
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);

        //fourth way
//        if (a>b){
//            if (a>c)
//                System.out.println("Largest number is " + a);
//            else
//                System.out.println("Largest number is " + c);
//        }
//        else{
//            if (b>c)
//                System.out.println("Largest number is " + b);
//            else
//                System.out.println("Largest number is " + c);


        }
    }
