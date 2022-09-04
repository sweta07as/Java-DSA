//every file that ends with .java is a CLASS
//convention for writing name of the class is that it starts with capital letter
//name of the main class should be the name of the file and that only that class should be public
//public means that particular class can be accessed from anywhere (other classes, files and packages)
//main function is from where the program starts and the name of the function should be main as per convention
// static means object independent (run without creating an object)
//String[] args are command line arguments
//environment variables is a list of folder addresses, in which the computer will check whether the command that you have written (on gitbash)is available or not
public class Demo{
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}
