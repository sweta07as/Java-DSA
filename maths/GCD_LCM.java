public class GCD_LCM {

    //GCD Greatest Common Divisor //HCF Highest Common Factor
    //Two numbers are called co-primes if their GCD is 1
    //HCF/GCD of a and b is equal to the minimum positive value of equation ax+by, where x and y are integers.
    //Whatever HCF you will get, that will come out as common in the equation ax+by
    //HCF of 0 and any other number is the number itself
    public static void main(String[] args) {
        System.out.println(gcd(105, 224));
        System.out.println(lcm(9, 18));
    }

    //Euclidean Algorithm: gcd(a, b) = gcd(rem(b,a), a)
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }

    //LCM(Least Common Multiple) is the minimum no. divisble by both a and b
    //a*b = lcm(a,b) * gcd(a,b)
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
