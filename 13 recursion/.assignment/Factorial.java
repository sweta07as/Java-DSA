public class Factorial {
    public static void main(String[] args) {
        System.out.println(fac(3));
    }
    static int fac(int num){
        if(num == 0){
            return 1;
        }
        return num * fac(num-1);
    }
}
