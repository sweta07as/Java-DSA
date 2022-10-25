import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {7, 3, 4, 4, 8};

//        System.out.println(search(arr, 4, 0));
//        System.out.println(index(arr, 4, 0));
//        System.out.println(findIndexFromLast(arr, 4, arr.length-1));

//        findAllIndex(arr, 4, 0);
//        System.out.println(list);


        //Returning An Arraylist
        //first way
        ArrayList<Integer> list = new ArrayList<>();
        findAllIndexbyReturningList(arr, 4, 0, list);
//        System.out.println(list);
        //second way
        ArrayList<Integer> ans = findAllIndexbyReturningList(arr, 4, 0, new ArrayList<>());
//        System.out.println(ans);

        //Return the ArrayList without passing the argument
        System.out.println(findAllIndexbyReturningListWithoutPassingArgument(arr, 4, 0));
    }
    static boolean search(int[] arr, int target, int i){
        if(i == arr.length){
            return false;
        }
        return arr[i] == target || search(arr, target, i+1);
    }
    static int index(int[] arr, int target, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == target){
            return i;
        }
        return index(arr, target, i+1); // doesn't make a diff, whether it is in else block
                                            // or without else block as in the below function,
                                            // bcz the if statements are always returned.
    }
    static int findIndexFromLast(int[] arr, int target, int i){
        if(i == -1){
            return -1;
        }

        if(arr[i] == target){
            return i;
        } else{
            return findIndexFromLast(arr, target, i-1); // doesn't make a diff, whether it is in else block
                                                            // or without else block as in the above function,
                                                            // bcz the if statements are always returned.
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int i){
        if(i == arr.length){
            return;
        }

        if(arr[i] == target){
            list.add(i);
        }
        findAllIndex(arr, target, i+1);
    }

    //Return an ArrayList
    static ArrayList<Integer> findAllIndexbyReturningList(int[] arr, int target, int i, ArrayList<Integer> list){
        if(i == arr.length){
            return list; //all the reference variables named "list" point to the same object
        }

        if(arr[i] == target){
            list.add(i);
        }
        return findAllIndexbyReturningList(arr, target, i+1, list);
    }

    //Return the ArrayList without passing the argument //not very optimized, hence don't use this approach often
    static ArrayList<Integer> findAllIndexbyReturningListWithoutPassingArgument(int[] arr, int target, int i){
        ArrayList<Integer> list = new ArrayList<>(); //diff object created for diff function calls
        if(i == arr.length){
            return list;
        }

        if(arr[i] == target){
            list.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndexbyReturningListWithoutPassingArgument(arr, target, i+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
