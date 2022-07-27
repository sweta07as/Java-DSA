import java.util.Arrays;

public class BubbleSort {
    //Bubble sort is a comparison sort method in which adjacent elements are compared.
    //With every pass/step, the largest element remaining in the array is coming at the last/end of that remaining array.
    //Also known as Sinking Sort and also known as Exchange Sort
    //Say length / no.of elements = N then outer loop (i.e., i) will run from 0 to N-1
    //i works like a counter here. i=0 means first pass, i=1 means second pass and so on
    //inner loop (i.e., j) will run from 0 to (N-i)-1
    //For a value of i, if j never swaps, it means array is sorted, hence program end.

    //Space Complexity is constant i.e., O(1) for all the six sorting algorithms.
    // no extra space required i.e., copying the array not required.
    //That is why it is also known as in-place sorting algorithms.

    //Time Complexity is how the no. of comparisons grows as the size of array grows.
    // Constants in time complexity is ignored bcz exact time is not required, relationship b/w time and input is required
    //Best Case: O(N) i.e., when the array is sorted. Here, its actually N-1 but constant is ignored.
    //Worst Case: O(N^2) i.e., when the array is sorted in the opposite order

    //In, Stable sorting algorithm, after sorting, order should be same as in the original array, when the value is same.
    //In, Unstable sorting algorithm, original order is not maintained after sorting, when the value is same.

    //Bubble Sort is a stable sorting algorithm.

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i, means array sorted, hence stop the program
            if(!swapped){ //!false = true
                break;
            }
        }
    }

}