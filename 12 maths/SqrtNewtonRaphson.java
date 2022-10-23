public class SqrtNewtonRaphson {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    //Time Complexity is O(log(n) * F(n)) where F(n) is
    //the cost of calculating f(n)/f'(n) with n-digit precision
    static double sqrt(double n){
        double x = n;
        double root;

        while(true){
            root = 0.5 * (x + (n/x));

            //here, 1 is taken as the precision value
            //if we take precision value, say 0.5, then it will be more precise (i.e., closer to the actual value)
            //which means error reduces but no. of steps increases as the precision value comes closer to 0
            if(Math.abs(root - x) < 1){
                break;
            }

            x = root;
        }
        return root;
    }
}
