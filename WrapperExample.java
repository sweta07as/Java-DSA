package oops1;
// To create primitives using "new" keyword, Wrapper Classes are used.
// i.e., using primitive as an object.
public class WrapperExample {
    public static void main(String[] args) {
        int a = 10; //primitive

//        Integer num = new Integer(45);
//        The above can also be simply written as:-
        Integer num = 45; //object of type "Integer"
                            // here, Integer is the wrapper class

// In java, there is no particular thing known as "pass by reference".
// In java, there is only "pass by value". Value of reference variable is passed.

//Strings are immutable. Immutable simply means unmodifiable or unchangeable.

//For primitives, it's just passing value. Hence, the original values doesn't change.
//For objects i.e., non-primitives, it's passing value of the reference variables.
// Hence, original values change.

//But here it's not swapping because Integer is a final class

        Integer b = 10;
        Integer c = 20;
        swap(b,c);
        System.out.println(b + " " + c);

//  "final" is a keyword that is used to prevent modification (i.e., to make constants)
        final int INCREASE = 2; //convention to write in capital letters
//      INCREASE = 3;           //gives error

//Immutibility of final keyword only holds true for primitive data types.
//In objects (non-primitives), you can modify the value of the object but cannot reassign it to other object, when final keyword is used.
        final A sweta = new A("Kunal Kushwaha");
        sweta.name = "other name"; //modification
//        sweta = new A("new object"); //error when reassigned


        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("random name");
        }
    }

    static void swap(Integer b, Integer c){
        //Here also it's not swapping because Integer is a final class

        Integer temp = b;
        b = c;
        c = temp;
    }
}

class A{
//    final int num; //gives error as it is not initialized
                    //since final variables can't be modified, that's why
    //              //final variables have to be intialized when it is declared.

    String name;
    A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}

//In Java, Garbage Collection happens automatically.
//But sometimes when an object is destroyed because of garbage collection,
//if we need to perform some sort of an action, to handle such situations Java provides "finalization"
//To do so, finalize() method will be called automatically when Java is doing Garbage Collection
//So right before the object is freed from the memory, Java calls the Garbage Collector and finalize() method
