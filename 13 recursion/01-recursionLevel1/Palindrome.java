public class Palindrome {
    static int rev(int n){
      int digits = (int) (Math.log10(n)) + 1;
      return helper(n, digits);
    }
    static int helper(int n, int digits){
        if(digits == 1){
            return n;
        }
        int rem = n%10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n/10, digits-1);
    }

    static boolean palindrome(int a){
        return a == rev(a);
    }
    public static void main(String[] args) {
        System.out.println(palindrome(2332));
    }

}
