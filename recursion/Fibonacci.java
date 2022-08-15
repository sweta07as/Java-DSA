// Golden ratio = ( 1+sqrt(5) ) / 2
// Time complexity of Recurrence relation of nth Fibonacci Number = (Golden ratio)^n

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibo(5);
        System.out.println(ans);
    }
    static int fibo(int n){

        if(n < 2){
            return n;
        }

//        When you write the recursion (i.e., recursive solution) in a formula, it is called recurrence relation.
//        Here the recurrence relation is, fibo(n) = fibo(n-1) + fibo(n-2)
        return fibo(n-1) + fibo(n-2);
    }
}
//Building recursive tree and using debug pointer are two ways to know the flow of program.

//    Dynamic Programming means if in the recursion calls, two or
//    more recursion calls are doing the same work,
//    don't compute it again and again.