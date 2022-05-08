import java.util.Scanner;

public class Sum {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                float a = input.nextFloat();
                float b = input.nextFloat();
                //to separate the inputs in command line, either use space or enter
                float sum = a + b;
                System.out.println("sum = "+ sum);
        }
        }
