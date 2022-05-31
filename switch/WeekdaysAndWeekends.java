// Q: Whether the entered value (between 1 and 7) is Weekday or Weekend
import java.util.Scanner;

public class WeekdaysAndWeekends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
