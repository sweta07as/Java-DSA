public class UppercaseLetter {
    public static void main(String[] args) {
        String str = "atewS";
        upper(str);
    }

    static void upper(String str){
        char ch = str.charAt(0);
        if(ch <= 90){
            System.out.println(ch);
            return;
        }

        upper(str.substring(1));
    }
}
