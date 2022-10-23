public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println(prime(11, 2));
    }
    static boolean prime(int num, int n){
        if(n == num){
            return true;
        }

        if(num % n == 0){
            return false;
        }
        return prime(num, n+1);
    }
}
