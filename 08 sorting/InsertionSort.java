import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    //In insertion sort, we sort the array partially. i.e., in parts.
    //For i = 0, i.e., for 1st pass, sort array till index 1
    //For i = 1, i.e., for 2nd pass, sort array till index 2 and so on.
    //So that is why, i will run from 0 to n-2 where n is the length of the array.

    //For every index j, put/insert that index element at the correct index on the LHS of index j (as the LHS will already be sorted)


    //Time Complexity
    //Best Case: O(N) i.e., when the array is sorted.
    //Worst Case: O(N^2) i.e., when the array is sorted in the opposite order

//  Why use it?
//  i) Adaptive: steps get reduced if array is sorted. Number of steps reduced as compared to Bubble sort.
//  ii) Stable sorting algorithm.
//  iii) Used for small arrays. Works good when array is partially sorted that's why it takes part in hybrid sorting algorithms.

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
