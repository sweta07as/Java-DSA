//Q1 to Q7
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape: ");
        String shape = sc.next();
        switch (shape){
            case "circle" -> {
                System.out.println("Enter radius: ");
                int r = sc.nextInt();
                double area = Math.PI * r * r;
                System.out.println(area);
            }
            case "quadrilateral" -> {
                System.out.println("Enter the quadrilateral: ");
                String quad = sc.next();
                switch(quad){
                    case "rectangle" -> {
                        System.out.println("Enter length and breadth: ");
                        int l = sc.nextInt();
                        int b = sc.nextInt();
                        int area = l*b;
                        System.out.println(area);
                    }
                    case "parallelogram" -> {
                        System.out.println("Enter base and height: ");
                        int b = sc.nextInt();
                        int h = sc.nextInt();
                        int area = b*h;
                        System.out.println(area);
                    }
                    case "rhombus" -> {
                        System.out.println("Enter value of diagonals: ");
                        float d1 = sc.nextInt();
                        float d2 = sc.nextInt();
                        float area = (d1*d2)/2;
                        System.out.println(area);
                    }
                    default -> System.out.println("Quadrilateral not valid!!!");
                }
            }
            case "triangle"-> {
                System.out.println("Enter the triangle: ");
                String tri = sc.next();
                switch (tri){
                    case "scalene" -> {
                        System.out.println("Enter base and height: ");
                        float b = sc.nextInt();
                        float h = sc.nextInt();
                        float area = (b*h)/2;
                        System.out.println(area);
                    }
                    case "isosceles"-> {
                        System.out.println("Enter the value of common sides: ");
                        double a = sc.nextInt();
                        System.out.println("Enter the value of the third side: ");
                        double b = sc.nextInt();
                        double area = (b*Math.sqrt((4*a*a)-(b*b)))/4;
                        System.out.println(area);
                    }
                    case "equilateral"-> {
                        System.out.println("Enter the common value of the sides: ");
                        int a = sc.nextInt();
                        double area = (Math.sqrt(3)*a*a)/4;
                        System.out.println(area);
                    }
                }
            }
            default -> System.out.println("Shape not valid!!!");
        }
    }
}
