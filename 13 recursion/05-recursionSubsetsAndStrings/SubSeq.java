import java.util.ArrayList;

//Subset is for Arrays
//Subsequence is for Strings
public class SubSeq {
//    Subset is non adjacent collection
//    Subset is a collection of any number of  elements that may or may not be adjacent
//    In subarrays, elements are continuous
//    Adjacent means continuous

//    In subsets, ordering cannot be changed, we are only taking sets/combinations, its not the permutations

//The pattern of taking some elements and removing some elements is known as subset pattern
//For "creating subsets" pattern, apply subset method

    public static void main(String[] args) {
        subSeq("", "abc"); //output also includes an empty string as a subset
        System.out.println(subSeqList("", "abc"));
    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    //Return an ArrayList of string
    static ArrayList<String> subSeqList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subSeqList(p + ch, up.substring(1));
        ArrayList<String> right = subSeqList(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
