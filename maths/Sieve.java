public class Sieve {
    //Sieve of Eratosthenes (SoE)
    //Space complexity is O(n)
    //Time complexity is O(n * log(log n))
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n+1];
        sieve(n, prime);
    }

    //initially, value of each element in the boolean array is false
    //here assume, false in array means number is prime
    static void sieve(int n, boolean[] prime){
        for (int i = 2; i * i <= n; i++) {
            if(!prime[i]){
                for (int j = i * 2; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
    }
}
