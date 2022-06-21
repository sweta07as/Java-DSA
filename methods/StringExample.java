import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        greetings();

//        String message = greet();
//        System.out.println(message);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = sc.nextLine();
        String personalised = myGreet(naam);
        System.out.println(personalised);
    }

    static void greetings(){
        System.out.println("Hello World");
    }

    static String greet(){
        String greeting = "How are you?";
        return greeting;
    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
}
