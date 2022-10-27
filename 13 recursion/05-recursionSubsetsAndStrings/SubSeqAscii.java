import java.util.ArrayList;

public class SubSeqAscii {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch + 0); //prints ascii value of a character
        subSeqAscii("", "abc");
        System.out.println(subSeqAsciiList("", "abc"));
    }

    static void subSeqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeqAscii(p + ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p + (ch+0), up.substring(1)); //string and number gets concatenated
    }

    static ArrayList<String> subSeqAsciiList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subSeqAsciiList(p + ch, up.substring(1));
        ArrayList<String> second = subSeqAsciiList(p, up.substring(1));
        ArrayList<String> third = subSeqAsciiList(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
