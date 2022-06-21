//Shadowing in Java is a practice of using two variables with the same name within the scope that overlaps
//Shadowing effect doesn't take place in methods. This works for class variables.
public class Shadowing {
    static int x = 90; //has its own scope //available to everything inside the block of x
                        // variable with higher level scope // will be hidden/shadowed at line 9

    public static void main(String[] args) {
        System.out.println(x);
//        int x = 40; // variable with lower level scope //overrides the one with higher level scope
                     //the class variable at line 3 is shadowed by this

        int x; //declaration
//      System.out.println(x); //gives error since it's not initialized
        x = 10; //initialization
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
