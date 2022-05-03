import java.util.Scanner;

//package is the folder in which your java file lies. It provides rules and security.
// for ex: com.sweta is a package where sweta is the subfolder of com folder
// standard output stream is command line
// standard input stream is keyboard


public class Main {
    public static void main(String[] args) {

        //println is "after printing, print a new line", you can use print( ) to not print a new line after printing.
        System.out.print("Hello World");
        System.out.println(2022);
        System.out.println("Welcome Home");
        //where "system" is a class AND it has a variable "out" of type PrintStream
        // AND "println" is a method of out and is also in PrintStream



        Scanner input = new Scanner(System.in);
        //in LHS, input is a variable of Scanner class AND in RHS, a new object is created.
        //you can name the variable as you wish, for ex: "sc" instead of "input"
        //every class in Java extends the object class

        System.out.println(input.nextInt()); //for integer
        System.out.println(input.next()); //for one word string
        System.out.println(input.nextLine()); //for multiple word string



    }
}