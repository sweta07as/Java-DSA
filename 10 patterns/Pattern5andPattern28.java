public class Pattern5andPattern28 {
    public static void main(String[] args) {
        pattern5(5);
        pattern28(5);
    }
    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2*n-row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2*n-row : row;

            //first way
            int noOfSpaces = n - totalColsInRow;

            //my way
//            int noOfSpaces = row > n ? row-n : n-row;

            for (int col = 0; col < noOfSpaces; col++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

