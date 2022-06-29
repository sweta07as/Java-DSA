import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //array of primitives
        int[] arr = new int[3]; //size is 3, index starts from 0 and ends at 2

        //WAYS TO INPUT AND PRINT
        //FIRST WAY
        arr[0] = 4;
        arr[1] = 7;
        arr[2] = 9;
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        //SECOND WAY
//        System.out.println(Arrays.toString(arr)); //easy way to print array //prints [4,7,9]
                                                    //If array size is 0, it prints []

        //THIRD WAY
        //input using for loops
        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
        }
        //print using for loops
        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
        }

        //FOURTH WAY
        //for each loop (enhanced for loop), only takes elements out of the array (used to print)
        //It cannot put anything back there. (not used to take input)

        for (int num : arr) { //for each element in array, print the element
//            System.out.print(num + " "); //here, num represents element of the array
        }

        //array of objects
        //heap memory contains reference variables of these objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
