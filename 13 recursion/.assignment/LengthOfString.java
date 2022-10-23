public class LengthOfString {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(len(str, 0));
    }
    static int len(String str, int c){
        if(str.isEmpty()){
            return c;
        }

        return len(str.substring(1), c+1);
    }
}
