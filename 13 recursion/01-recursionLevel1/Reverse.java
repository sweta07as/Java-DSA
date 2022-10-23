public class Reverse {
    static int sum = 0;
    static void rev1(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum*10 + rem;
        rev1(n/10);
    }

    //Other two ways to reverse a number are:-
    // 1) taking digits in the argument, like:  static int rev3(int n, int digits){ ... }
    // 2) taking digits outside, like: static int digits = (int) (Math.log10(n)) + 1;
    static int rev2(int n){
      //sometimes you might need some additional variables in the argument
      //in that case, make another function
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

    public static void main(String[] args) {
//        rev1(1024);
//        System.out.println(sum);
        System.out.println(rev2(5042));
    }

}
