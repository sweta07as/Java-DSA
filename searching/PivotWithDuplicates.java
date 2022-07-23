//Q9:Rotated Binary Search in Array with Duplicate Values

public class PivotWithDuplicates {
    //Ans: Pivot Index in Rotated Array with Duplicate Values

    public static void main(String[] args) {
        int[] nums = {2,9,2,2,2};
        System.out.println(pivot(nums));
    }
    static int pivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid<end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid] < nums[mid-1]){
                return mid-1;
            }

            //if elements at middle, start and end are equal, then just skip the duplicates
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){

                //check whether start is pivot
                if(nums[start] > nums[start+1]){
                    return start;
                }
                start++;

                //check whether end is pivot
                if(nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[end] < nums[mid])) {
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1; //array is not rotated
    }
}
