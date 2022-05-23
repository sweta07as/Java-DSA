
//Q: Input a character/letter/alphabet and print whether its uppercase or lowercase.

import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//   To input a character, there is no such thing as nextChar(),
//   to do so, use next().charAt(0), since string is a character array

//        trim() is used to remove the extra spaces that are at the ends of a word
//        for ex
//        System.out.println(sc.next().trim());

        //first way
        char ch = sc.next().trim().charAt(0);
        if (ch>= 'a' && ch<= 'z')
            System.out.println("Lowercase");
        if (ch>= 'A' && ch<= 'Z')
            System.out.println("Uppercase");

        //second way
//        int c = sc.next().charAt(0);
//        if (c>=97 && c<= 122)
//            System.out.println("Lowercase");
//        if (c>=65 && c<= 90)
//            System.out.println("Uppercase");
    }
}
