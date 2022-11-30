package oops1;
//A class is a named group of properties(i.e., variables) and methods i.e., combined as a single entity
//By convention, name of a class starts with a Capital Letter
//Classes are used to create your own data type.
//A class is a template for an object.
//An object is an instance of a class.
//It's the object (not the class) that occupies space in the memory.

//Objects are characterized by three essential properties: state, identity, and behavior:-
//        The state of an object is a value from its data type. The identity of an object distinguishes one object from another.
//        It is useful to think of an object’s identity as the place where its value is stored in memory.
//        The behavior of an object is the effect of data-type operations.

//Objects are stored in heap memory and their reference variables are stored in stack memory.

//The dot operator links the name of the object with the name of an instance variable.
//Instance Variables are those variables that are inside the object/class (but should be outside the method)
//Reference Variable is the variable that actually defines the object.
public class Class {
    public static void main(String[] args) {

//        Student sweta; //declaration //creating a reference variable of data type Student
//        System.out.println(sweta); ///error: not initialized
//        sweta = new Student(); //initialization  //actually creating an object

//  The 'new' keyword dynamically allocates(i.e., allocates at run time) memory for an object & returns a reference to it.
//  This reference is then stored in the variable.
//  This reference is, more or less, the address of memory of the object allocated by new.
//  Thus, in Java, all class objects must be dynamically allocated.

        Student sweta = new Student(); //declaration and initialization
        System.out.println(sweta); //gives random value

        sweta.roll = 14;
        sweta.name = "Sweta";
        System.out.println(sweta.roll); //by default, it will be 0
        System.out.println(sweta.name); //by default, it will be null (since it is an object)
        System.out.println(sweta.marks); //by default, it will be 88.8 instead of 0.0

//        Java is statically-typed, so it expects its variables to be declared before they can be assigned values.
//        sweta.salary = 1000; //gives error as salary is not declared in the class Student

        Student[] students = new Student[5];
//        System.out.println(Arrays.toString(students)); //By default, objects are initialized to null

//        A constructor defines what occurs when an object of a class is created.
//        Constructor is a special function that runs (automatically called) when you create an object & it allocates some variables
//        By default, constructor have no arguments and this is called the By Default Constructor.
//        If you don't have your own constructor, then Java calls the By Default Constructor and assigns every variable as empty (null or 0)
        Student anaa = new Student();
        System.out.println(anaa);
        System.out.println(anaa.roll);
        System.out.println(anaa.name);
        System.out.println(anaa.marks);

        sweta.changeName("Soni");
        sweta.greeting();

        Student adi = new Student(7, "Aditya", 95.5f);
        System.out.println(adi.roll);
        System.out.println(adi.name);
        System.out.println(adi.marks);

        Student random = new Student(sweta);
        System.out.println(random.name);

        Student one = new Student();
        Student two = one;
        one.name = "Something";
        System.out.println(two.name);
    }
}
//create a class
class Student{
    int roll;
    String name;
    float marks = 88.8f;

    void greeting(){
        System.out.println("Hello, my name is " + this.name);
    }

    void changeName(String name){
        this.name = name;
    }
    //constructor does not have a name and the return type is the class itself
    //"this" keyword is used to access the object. It gets replaced with the name of the reference variable of the object.
    Student(){
//        this.roll = 8;
//        this.name = "Ananya";
//        this.marks = 88.9f;

        //caling a constructor from another constructor
        this(8,"Ananya", 88.9f);
    }

    //constructor overloading
    Student(int roll, String name, float marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.roll = other.roll;
        this.name = other.name;
        this.marks = other.marks;
    }
}

//Why we don't use "new" keyword for creating primitive data types?
//  In Java, the primitive data types are not implemented as objects.
//  Primitves are stored in stack memory to increase efficiency.
// To create primitives using "new" keyword, Wrapper Classes are used.