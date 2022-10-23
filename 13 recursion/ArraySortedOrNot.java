public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {20, 20, 78, 98, 99, 97};
        System.out.println(sorted(arr, 1));
    }

    static boolean sorted(int[] arr, int i){
        if(i == arr.length){
            return true;
        }
        if(arr[i-1] > arr[i]){
            return false;
        }
        return sorted(arr, i+1);
    }
}
