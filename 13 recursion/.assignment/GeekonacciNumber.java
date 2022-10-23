public class GeekonacciNumber {
    public static void main(String[] args) {
        System.out.println(geek(1,3,2,5));
    }
    static int geek(int a, int b, int c, int n){
        if(n == 1){
            return a;
        }
        if(n == 2){
            return b;
        }
        if(n == 3){
            return c;
        }

        return geek(a, b, c, n-1) + geek(a, b, c, n-2) + geek(a, b, c, n-3);
    }
}
