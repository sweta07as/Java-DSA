public class SqrtBS {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.printf("%.3f", sqrtBS(n,p)); //pretty printing //formatted string //printf rounds off as well
                                                //where % is the placeholder for the value returned by the method.
    }

    //Time Complexity is O(log(n))
    static double sqrtBS(int n, int p){
        int start = 0;
        int end = n;
        double root = 0.0;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid*mid == n){
                return mid;
            }

            if(mid*mid > n){
                end = mid - 1;
            } else{
                start = mid + 1;
                root = mid; //this line is missed in the lecture, but written in the code file.
            }

        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while(root*root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }

}
