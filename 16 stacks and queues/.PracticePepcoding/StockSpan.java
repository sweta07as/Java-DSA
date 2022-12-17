import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,7};
        int[] ansFromRightApproach = solve(arr);
        System.out.println(Arrays.toString(ansFromRightApproach));
    }

    public static int[] solve(int[] arr) {
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                span[i] = i + 1;
            } else{
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }
}
