//Array is a data structure which stores collection of elements of same data type.
//Array is considered to be an object in Java. Because array can be created using the 'new' keyword

//Declaration Syntax (where brackets means this is an array AND size is the size of array)
// datatype[] variable_name = new datatype[size];

//In C/C++, there is continuous memory allocation in case of arrays
//In Java, there is no concept of pointers, so it depends on JVM whether it's going to be continuous
//or not, since heap objects are not continuous.

//Stack memory stores primitives and reference variables. But all objects are stored in heap memory.
public class Main {
    public static void main(String[] args) {
        int a = 19;
        String name = "Sweta Agrawal";

        //ways to create array
        //first way (LHS happens at compile time, RHS happens at runtime)
        int[] rnos = new int[5]; //Dynamic Memory Allocation i.e., memory allocated at runtime
        //second way (directly inside curly braces)
        int[] rno = {23, 12, 45, 32, 15};
        //third way
        int[] roll; //declaration (reference variable roll is defined in stack memory at compile time)
        roll = new int[5]; //initialisation (array object is created in heap memory at runtime)
        System.out.println(roll[1]); //by default, integer array have elements of value 0.

        String[] arr = new String[4];
        System.out.println(arr[3]); //by default, String array have elements of null type.

        //Null is a special literal(where literal means constant value or fixed value) which can
        //be assigned to non-primitives only.
        //For ex
        String str = null;
    }
}