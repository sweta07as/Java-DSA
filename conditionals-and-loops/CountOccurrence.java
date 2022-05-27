import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 56778;
        int count = 0;

        //first way
        while (num != 0) {    // we can also use while (num > 0) instead
            if (num % 10 == 7)
                count++;
            num /= 10;  //num = num/10;

            //in the last loop, since num is integer, floating/decimal points are cancelled out
            //and not rounded off to get the integer value 0
        }



        //second way
//        String word = Integer.toString(num);
//        int total = word.length();
//        for (int i = 0; i < total; i++) {
//            if (word.charAt(i) == '7')
//                count++;
//        }

        System.out.println(count);
    }
}