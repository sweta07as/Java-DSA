public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        minMax(arr, 1, arr[0], arr[0]);
    }
    static void minMax(int[] arr, int i, int min, int max){
        if(i == arr.length){
            System.out.println("min = " + min);
            System.out.println("max = " + max);
            return;
        }

        if(arr[i] > max){
            max = arr[i];
        }
        if(arr[i] < min){
            min = arr[i];
        }
        minMax(arr, i+1, min, max);
    }
}
