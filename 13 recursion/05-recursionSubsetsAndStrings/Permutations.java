import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        perm("", "abc");

//        ArrayList<String> ans = permList("", "abc");
//        System.out.println(ans);

        System.out.println(permCount("", "abc"));
    }

    //Subset method is used in Permutations and Combinations
    //Permutations means rearrangement
    //Combinations means subset

    //If the size of array / list / string is n, then the total no. of permutations is n!

    static void perm(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            perm(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>(); //local to the call

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permList(f + ch + s, up.substring(1)));
        }

        return ans;
    }

    //Counting Number Of Permutations
    static int permCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permCount(f + ch + s, up.substring(1));
        }
        return count;
    }

}
