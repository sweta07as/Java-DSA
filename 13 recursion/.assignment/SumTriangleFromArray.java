import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sum(arr);
    }

    static void sum(int[] old) {
        if (old.length == 1) {
            System.out.println(Arrays.toString(old));
             return;
        }
        int[] arr = new int[old.length - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = old[i] + old[i + 1];
        }
        sum(arr);
        System.out.println(Arrays.toString(old));
    }
}
