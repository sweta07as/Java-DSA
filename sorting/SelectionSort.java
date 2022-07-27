import java.util.Arrays;

public class SelectionSort {

//    In selection sort, we select an element and put it at its correct position/index.
//    This can be done in two ways:-
//    i) using largest element ii) using smallest element

    //Time Complexity
    // Best Case: O(N^2) AND Worst Case: O(N^2)
    //Both are same, bcz in both cases it is making equal no. of comparisons to find the maximum item in the array.

    //Selection Sort is a unstable sorting algorithm.
    //Use case: Performs well on small arrays.

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = max(arr, 0, last); //here, we are using the first way i.e., largest element
            swap(arr, maxIndex, last);
        }
    }

    static int max(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
