//intermediate //Q2 Calculate Electricity Bill

//        1 to 100 units – Rs. 10/unit
//        100 to 200 units – Rs. 15/unit
//        200 to 300 units – Rs. 20/unit
//        above 300 units – Rs. 25/unit

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int bill = 0;
        if (1 <= unit && unit <= 100){
            bill = unit*10;
        } else if (100 < unit && unit <= 200) {
            unit = unit - 100;
            bill = unit*15 + 1000;
        } else if (200 < unit && unit <= 300) {
            unit = unit - 200;
            bill =  unit*20 + 1500 + 1000;
        } else if (unit> 300) {
            unit = unit - 300;
            bill = unit*25 + 2000 + 1500 + 1000;
        }
        System.out.println(bill);
    }
}
