import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();
        circle(r);
    }
    static void circle(int r){
        double circum = 2* Math.PI * r;
        System.out.println("Circumference is " + circum);
        double area = Math.PI* r* r;
        System.out.println("Area is " + area);
    }
}
