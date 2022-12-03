package oppsByLB;

//Object Oriented Programming is a programming technique that revolves around classes and objects
//It has four principles: abstraction, inheritance, encapsulation, and polymorphism
//template //user defined data type
//object is something which occupies space/memory //instance //real entity


public class Main {
    public static void main(String[] args) {
//        System.out.println("sweta");

        //create an object
        Human sweta = new Human();
        //using new, it takes memory in Heap in Runtime

        sweta.age = 23;
        sweta.weight = 55;
        sweta.eat();

        Human obj = new Human(18, 42);

        System.out.println(Human.count); //static members are accessed by class name
                                            //can be accessed without making objects
        Student one = new Student();
        one.marks = 10; //protected access modifier example
    }
}

//create a class

class Human{
    //properties //data members
    int age;
    int weight;
    static int count = 0; //static members belongs to class (not to object) //common for all objects
                            //it consumes less memory as it belongs to the class only and not to all the objects

    //functions
    void sleep(){
        System.out.println("sleeping");
    }

    void eat(){
        System.out.println("eating");
    }

    //static method can only modify static variables (i.e., cannot modify non-static data members)
    //this and super cannot be used in static context
    static void update(){
        count++;
    }
    //constructor is called when an object is created.
    //used for initialisation

    //costructor has no return type
    //costructor's name is same as class name
    //costructor can't be abstract, static, final or synchronized

    //3 types of contructor:-

    //default contructor

    //no argument constructor
    public Human(){
        System.out.println("Inside the no arg constructor");
        count++;
    }

    //parameterized constructor
    public Human(int age, int weight){
        //"this" keyword can also be used to access constructor
        this(); //accesses the constructor with no parameter
        //"this" keyword is used to access current object's data members and functions
        this.age = age;
        this.weight = weight;
        this.eat();

        count++;
    }

    //constructor overloading //having same name but diff(either number or type) parameters
    public Human(int age){
        count++;
        this.age = age;
    }

    //difference between constructor and method:-
    // no return type                                   //return type
    //same name as class                                //no same name
    //called automatically during object creation       //called manually
    //cannot be static                                   //can be static

    //object can be copied in three ways:-
    //i) by assigning values individually i.e., obj1.age = obj2.age
    //ii) by object cloning i.e., clone() method
    //iii) by using constructor (i.e., using class as a parameter) as follows:
            // Student(Student other){
            // this.roll = other.roll;
            // this.name = other.name;
            // this.marks = other.marks;
            //    }

}
