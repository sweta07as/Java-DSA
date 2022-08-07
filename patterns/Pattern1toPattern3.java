//Pattern questions are for enhancing thought process and problem solving skills.
public class Pattern1toPattern3 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();  //println is "after printing, print a new line"
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){

        for (int row = 1; row <= n; row++) { //if the outer loop ran from 0 to n-1, then inner loop will run from 0 to n-row
            for (int col = 1; col <= (n-row)+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
