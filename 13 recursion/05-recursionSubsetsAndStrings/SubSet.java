import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Time Complexity is O(N * (2^N)) where N is the no. of elements in the array AND 2^N is the total no. of subsets
//Space Complexity is O((2^N) * N) where 2^N is the total no. of subsets AND the space taken by each subset is O(N)

//iterative programs
public class SubSet {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3};
//        List<List<Integer>> ans = subset(arr);
//        for(List<Integer> list : ans){
//            System.out.println(list);
//        }

        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
        }
        return outer;
    }

    //When you find a duplicate element, only add it in the newly created subset of previous step.
    //Array needs to be sorted, to keep all the duplicates together
    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i=0; i< arr.length; i++){
            start = 0;
            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
