package oops2.staticExample;

//properties that are not directly related/ dependent on the objects
//but common to all the objects of the class
//are called static properties (i.e., static variables or static methods).
//To access Static variables, name of the Class is used instead of "this" keyword

//When a member is declared static, it can be accessed before any objects of its class are created,
//and without reference to any object. You can declare both methods and variables to be static.

//Static member in Java is a member which belongs to the class and not to the object.

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; //static variable //not instance variable //initially 0

    static void message(){
        System.out.println("hello world");

//        A static method cannot refer to "this" or "super" keywords in anyway
//        System.out.println(this.age); //gives error
    }


    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;

//        A static method can be accessed directly by the class name and doesn’t need any object
        Human.message();

//        A static method cannot refer to "this" or "super" keywords in anyway
//        this.message(); //gives error
    }
}
