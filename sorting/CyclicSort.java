import java.util.Arrays;

public class CyclicSort {
//    When given numbers are continuous AND are in the range from 1 to N, then use Cyclic Sort
    //Time Complexity
    //Worst Case: O(N)
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1; //index = value - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}