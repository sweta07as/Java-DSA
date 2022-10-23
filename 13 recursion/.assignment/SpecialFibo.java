public class SpecialFibo {
    public static void main(String[] args) {
        System.out.println(fibo(92, 49, 21));
    }

    static int fibo(int a, int b, int n){
        if(n == 0){
            return a;
        }
        if(n == 1){
            return b;
        }

        return fibo(a, b, n-1)^fibo(a, b, n-2);
    }


}
