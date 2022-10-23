import java.util.ArrayList;
//Incomplete And Wrong
public class PowerSetLexico {
    public static void main(String[] args) {
        String str = "abc";
        lexico("", str);
    }
    static void lexico(String p, String up){

        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);
        lexico(p+ch, up.substring(1));
        lexico(p, up.substring(1));
    }
}
