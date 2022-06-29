import java.util.Arrays;
import java.util.Scanner;

//Multidimension Array is stored as "Array of arrays" in heap memory
public class MultiDimension {
    public static void main(String[] args) {
      /*
            1 2 3
            4 5 6
            7 8 9

       */

        Scanner sc = new Scanner(System.in);

        int[][] ar = new int[3][];  //specifying no. of rows is mandatory (left bracket)
                                    // whereas not mandatory to specify the no. of columns (right bracket)
                                    // because it can have variable no. of columns i.e., size of
                                    // individual rows(i.e., individual arrays) can be different

        int[][] arry = {
                {1,2,3},    //0th index of row
                {4,5},      //1st index of row
                {6,7,8,9}   //2nd index of row
        };

        //input
        int[][] arr = new int[3][2];
//        System.out.println(arr.length); //gives the no. of rows i.e., 3 here

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }

        }

        //output
        //FIRST WAY
        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
            }
//            System.out.println(); //prints new line
        }

        //SECOND WAY
        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
        }

        //THIRD WAY
        for (int[] a : arr) { //here, a represents element of the outside array
            System.out.println(Arrays.toString(a)); //each element of the outside array is an array itself
                                                    // so the data type of each element will be integer array i.e., int[]
                                                    // for each element in outside array, print the element
        }

    }
}
