import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3D shape: ");
        String shape = sc.next();
        switch (shape){
            case "cone"->{
                System.out.println("Enter radius and height: ");
                int r = sc.nextInt();
                int h = sc.nextInt();
                double volume = (Math.PI*r*r*h)/3;
                System.out.println(volume);
            }
            case "prism" ->{
                System.out.println("Enter length, breadth and height: ");
                float l = sc.nextInt();
                float b = sc.nextInt();
                float h = sc.nextInt();
                float volume = (l*b*h)/2;
                System.out.println(volume);
            }
            case "cylinder" ->{
                System.out.println("Enter radius and height: ");
                int r = sc.nextInt();
                int h = sc.nextInt();
                double volume = Math.PI*r*r*h;
                System.out.println(volume);
            }
            case "sphere" ->{
                System.out.println("Enter the radius: ");
                int r = sc.nextInt();
                double volume = (4*Math.PI*r*r*r)/3;
                System.out.println(volume);
            }
            case "pyramid" ->{
                System.out.println("Enter base area and height: ");
                float B = sc.nextFloat();
                int h = sc.nextInt();
                float volume = (B*h)/2;
                System.out.println(volume);
            }
            default -> System.out.println("Shape not valid!!!");
        }
    }
}
