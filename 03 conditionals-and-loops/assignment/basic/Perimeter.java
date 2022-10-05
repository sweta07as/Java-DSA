//Q8 to Q13
import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape: ");
        String shape = sc.nextLine();
        switch (shape){
            case "circle" ->{
                System.out.println("Enter the radius: ");
                int r = sc.nextInt();
                double perimeter = 2*Math.PI*r;
                System.out.println(perimeter);
            }
            case "equilateral triangle"->{
                System.out.println("Enter the common value of the sides: ");
                int a = sc.nextInt();
                int perimeter = 3*a;
                System.out.println(perimeter);
            }
            case "parallelogram", "rectangle" ->{
                System.out.println("Enter the value of any two alternate sides: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int perimeter = 2*(a+b);
                System.out.println(perimeter);
            }
            case "square", "rhombus" ->{
                System.out.println("Enter the common value of sides: ");
                int a = sc.nextInt();
                int perimeter = 4*a;
                System.out.println(perimeter);
            }
            default -> System.out.println("Shape not valid!!!");
        }
    }
}
