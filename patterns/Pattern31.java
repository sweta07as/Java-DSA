public class Pattern31 {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern31(int n){
        int originalN = n;
        n = 2*n - 2;
        System.out.println(n);
        for (int row = 0; row < 2*originalN - 1; row++) {
            for (int col = 0; col < 2*originalN - 1; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row,col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
