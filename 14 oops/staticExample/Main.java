package oops2.staticExample;

//since Human and Main class are in the same package, no need to use import statement

//The most common example of a static method is main( ).
//main( ) is declared as static because it must be called before any objects exist.

public class Main {
    public static void main(String[] args) {
//        Human sweta = new Human(23, "Sweta", 10000, false);
//        Human ananya = new Human(21, "Ananya", 20000, true);
//
//        System.out.println(Human.population);


//        greeting(); //inside a static method, you cannot use anything that is non-static

        Main funn = new Main();
        funn.fun2();
    }

//    A static method can access only static data. It cannot access non-static data
//    A static method can call only other static methods and cannot call a non-static method from it.
//    A non-static member belongs/requires to an object/instance.
//    In a static context, you don't have/depend on an instance, that's why you can't access a non-static member inside a static member

    void greeting(){
        System.out.println("Hello World");
        fun(); //inside a non-static member, you can have/access static member
    }


//    In fact, you can access a non-static member in a static context by specifying the object reference explicitly
    static void fun(){
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting(); //Since an object for fun2 will be created in the main()
                    // so here you don't have to create an object for greeting()
    }
}
