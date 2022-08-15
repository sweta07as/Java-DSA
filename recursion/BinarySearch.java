//Types of recurrence relation :-
//        i) Linear (for ex : fibo)
//        ii) Divide and conquer (for ex : binary search)

//In recursion, variables exist in three places :-
//        1) Arguments : they go in next function calls
//        2) Return Type
//        3) Body of the function : they are specific to a particular call

//Make sure to return the result of a function call of the return type

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 , 4, 55, 66, 78};
        int target = 4;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
    static int search(int[] arr, int target, int s, int e){

        if(s > e){
            return -1;
        }

        int m = s + (e - s)/2;

//        Here the recurrence relation is, f(n) = O(1) + f(n/2); where in RHS, first term is for comparison and
//                                                               second term is for dividing array into half
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }
}
