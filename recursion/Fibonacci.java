// Golden ratio = ( 1+sqrt(5) ) / 2
// Time complexity of Recurrence relation of nth Fibonacci Number = (Golden ratio)^n

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibo(5);
        System.out.println(ans);
        
        //from Time and Space Complexity lecture:-
        for (int i = 0; i < 11; i++) {
            System.out.println(fiboFormula(i));
        }
        System.out.println(fiboFormula(50));
    }
    static int fibo(int n){

        if(n < 2){
            return n;
        }

//        When you write the recursion (i.e., recursive solution) in a formula, it is called recurrence relation.
//        Here the recurrence relation is, fibo(n) = fibo(n-1) + fibo(n-2)
        return fibo(n-1) + fibo(n-2);
    }
    
    //from Time and Space Complexity lecture :-
    static int fiboFormula(int n){
        return (int)((Math.pow(((1 + Math.sqrt(5))/2), n) - Math.pow(((1 - Math.sqrt(5))/2), n)) / Math.sqrt(5));
    }
}
//Building recursive tree and using debug pointer are two ways to know the flow of program.

//    Dynamic Programming means if in the recursion calls, two or
//    more recursion calls are doing the same work,
//    don't compute it again and again.
