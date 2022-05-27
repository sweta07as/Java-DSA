public class Reverse {
    public static void main(String[] args) {
        int num = 23597;

        //first way
        int rev = 0;
        while (num>0){
            int rem = num % 10;
            num = num/10;
            rev = rev*10 + rem;
        }


        //second way
//        String word = Integer.toString(num);
//        String rev = "";
//        char ch;
//        for (int i=0; i < word.length(); i++)
//        {
//            ch = word.charAt(i);
//            rev = ch + rev ;
//        }


        System.out.println(rev);

    }
}
