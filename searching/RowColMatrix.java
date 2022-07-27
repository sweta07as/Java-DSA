import java.util.Arrays;
import java.util.Scanner;

//  Matrix is 2D array.
//  Traverse means to run through

//  For Square Matrix, Time Complexity in Worst Case is O(N^2). If No. Of Rows = M and No. Of Columns = N then it is O(M*N).

//  When you are given large search spaces, try to figure out how you can minimize/reduce the search space.
//  To do so, you have to think about how you can eliminate rows and columns.

//   Worst Case Time Complexity of Binary Search in Row Column Matrix is N+N i.e., 2N i.e., O(N)
//   Space Complexity is constant i.e., O(1)

public class RowColMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search(arr, 39)));
    }

    static int[] search(int[][] matrix, int target){

        int row = 0;                    //  Row 0 is the lower bound/start
        int col = matrix.length - 1;    //  Column last is the upper bound/end
                                        //  for M*N matrix, assign the value of the last column to the variable col

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col] < target){
                row++;
            } else{
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
