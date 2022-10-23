public class CountZeros {
    public static void main(String[] args) {
//        count1(30402);
//        System.out.println(c);
        System.out.println(count2(304002));
    }

    //my way
    static int c = 0;
    static void count1(int n){
        if(n == 0){
            return;
        }
        if(n%10 == 0){
            c++;
        }
        count1(n/10);
    }

    //another way //special pattern, how to return a value to above function calls
    static int count2(int n){
      return helper(n, 0);
    }
    static int helper(int n, int c){
        if(n == 0){
            return c;
        }
        if(n%10 == 0){
            return helper(n/10, c + 1);
        }
        return helper(n/10, c);
    }
}
