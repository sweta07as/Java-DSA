import java.util.Arrays;
//pivot is a reference point, aka partition
//after every pass, we put pivot at its correct position.
//Choose any element as pivot, after first pass,
    //all the elements < pivot will be on the LHS of pivot
    //all the elements > pivot will be on the RHS of pivot

//In merge sort, even if the array is sorted, then also it will go till it reaches the base condition
//In quick sort, if the array is already sorted, it will not try to sort it even more. Also, here the original array is sorted.

//s and e are used for swapping
//low and high tells us which part of array you are working on

//How to pick pivot:
//i) Random element
//ii) Corner elements (Worst Case: O(N^2)
//iii) Middle element (Best Case: O(NlogN)

//Quick Sort Features:
//i) Not Stable
//ii) In Place

//Quick Sort is preferred for arrays due to its in-place feature
//Merge Sort is better for linked lists due to its non-continuous memory allocation

//Internal sorting algorithm uses hybrid sorting (Tim Sort) that uses Merge+Insertion (as we know insertion works well with partially sorted data)

//Using adjacent elements instead of pivot, is another approach to use Quick Sort
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        //Internal Sorting Algorithms
//        Arrays.sort(arr); //Use this for efficiency
//        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] nums, int low, int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;

        int m = s + (e - s)/ 2;
        int pivot = nums[m];

        while(s <= e){
            // if array is already sorted, it will not swap

            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        //now pivot is at correct index, sort the two halves
        quick(nums, low, e);
        quick(nums, s, high);
    }

}
