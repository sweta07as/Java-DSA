public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(12345));
    }
    static int sum(int num){
        if(num == 0){
            return 0;
        }
        int rem = num % 10;
        return sum(num/10) + rem;
    }
}
