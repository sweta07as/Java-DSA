package oops2.a;
//import makes only those items within the package that are declared as public available outside the package
import static oops2.b.Message.message;

//In simple terms, a package is just a folder
//Packages eliminate the concern of classes with same name colliding with some each other
public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello");
        message();
    }
}
