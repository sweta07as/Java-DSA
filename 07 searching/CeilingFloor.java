public class CeilingFloor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14 , 16, 18};
        int target = 20;
        int ans = ceil(arr,target);
//        int ans = floor(arr,target);
        System.out.println(ans);
    }

    //Ceiling of a target number is the smallest element in array i.e., greater than or equal to target.
    static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //also used in first way
        if (target > arr[end])
            return -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target <  arr[mid]){
                end = mid -1;
            } else if(target >  arr[mid]){
                start = mid + 1;
                //my way //returned -1 after the loop //incorrect for a target > arr[end]
//                if(arr[start] >= target){
//                    return start;
//                }
            } else {
                return mid;
            }
        }
        //first way
        return start;
    }

    //Floor of a target number is the biggest element in array i.e., smaller than or equal to target.
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target <  arr[mid]){
                end = mid -1;
                //my way //returned -1 after the loop //incorrect for a target < arr[start]
//                if(arr[end] <= target){
//                    return end;
//                }
            } else if(target >  arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        //first way
        return end;
    }

}
