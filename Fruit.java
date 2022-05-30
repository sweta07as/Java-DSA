import java.util.Scanner;
public class Fruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        
        // .equals only checks the value (not the reference) i.e., value of the reference variables
        // == also checks the reference (apart from value) i.e., if reference variables point to same object
        //then its true, if they point to two diff objects then it may give false.
        //for ex
//        if (fruit.equals("mango")){
//
//        }

        //in switch statements, you can jump to various cases based on your expression
//        switch (fruit){
//            case "mango":
//                System.out.println("king of fruits");
//                break;
//            case "apple":
//                System.out.println("a sweet red fruit");
//                break;
//            case "orange":
//                System.out.println("round fruit");
//                break;
//            case "grapes":
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");
//
//        }
//
        //enhanced switch //using alt+shift+enter
        //in this, imagine break; is internal here
        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("a sweet red fruit");
            case "orange" -> System.out.println("round fruit");
            case "grapes" -> System.out.println("small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}