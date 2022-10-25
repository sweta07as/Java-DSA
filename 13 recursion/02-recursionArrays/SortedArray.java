public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 6, 9};
        System.out.println(sorted(arr, 0));
//        System.out.println(sorted2(arr, 0));
    }

    static boolean sorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && sorted(arr, i+1);
    }

    //my way //two base conditions
    static boolean sorted2(int[] arr, int a){
        if(a == arr.length-1){
            return true;
        }

        if(arr[a] > arr[a+1]){
            return false;
        }

        return sorted(arr, a+1);
    }
}
