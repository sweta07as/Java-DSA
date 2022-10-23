public class Prime {
//    A number is prime if it is only divisible by 1 and itself
//    0 and 1 are neither prime nor composite
    public static void main(String[] args) {
        int n = 5;

        //time complexity is O(n * sqrt(n))
        for (int i = 1; i <= n; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    // time complexity is O(n)
    static boolean isNumberPrime(int n){
        for(int i = 2; i < n; i++){
            if(n <= 1){
                return false;
            }
           if(n % i == 0){
               return false;
           }
        }
        return true;
    }

    // time complexity is O(sqrt(n))
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        int c = 2;
        while(c * c <= n){ //Squaring c <= sqrt(n) on both the sides gives the condition of while loop
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
