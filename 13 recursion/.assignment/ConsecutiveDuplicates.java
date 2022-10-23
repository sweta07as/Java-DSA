public class ConsecutiveDuplicates {
    public static void main(String[] args) {
        String s = "aabccba";
        System.out.println(remove(s));
    }
    static String remove(String str){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);
        if(str.length() > 1 && str.charAt(1) == ch){
            return remove(str.substring(1));
        }
        return ch + remove(str.substring(1));
    }
}
