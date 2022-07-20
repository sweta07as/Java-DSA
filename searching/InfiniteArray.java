//Find position of an element in a sorted array of infinite numbers
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,9,15,18,24,29,30,37,40};
        int target = 15;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        //we have to find the range then apply BS in that range

        //initially, chunk size is 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while(target > arr[end]){
            int temp = end + 1;
            //chunk size = end - start + 1
            end = end + (end - start + 1)*2; //doubling chunk size after every iteration of the loop
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid])
                end = mid - 1;
            else if(target > arr[mid])
                start = mid + 1;
            else{
                return mid;
            }
        }
        return -1;
    }
}
