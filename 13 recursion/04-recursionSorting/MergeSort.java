import java.util.Arrays;
//Merge sort  is a sorting technique that uses recursion i.e., divide and conquer
//Steps: divide then sort then merge
//Time Complexity: O(N*logN)
//Space Complexity: Maximum height of the tree i.e., O(N) //doubt

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergeSort(arr); //to modify the original array, just update it by this way
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){ //in this way, original array is not modified.
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); //here, a copy of array (i.e., new object) is being created
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)); //the last term in the function call is exclusive

        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix =  new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //copy the remaining elements of either of the two arrays (the one which is not finished yet)
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
