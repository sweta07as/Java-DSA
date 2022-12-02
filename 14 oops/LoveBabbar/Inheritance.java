package oppsByLB;
//In inheritance, a class acquires all the properties and functions of another class
//Former is called child class/sub class and Latter is called parent class/super class
//Advantage of inheritance is reusability
//Inheritance: is-a relationship //for ex: female is a human
public class Inheritance {
    public static void main(String[] args) {
        Female alpha = new Female(23);
        alpha.sleep();

//        Scorpio fav = new Scorpio();
//        fav.runCar();
    }
}

//single inheritance //parent child //doubt constructor
class Female extends Human{
    public Female(int age){
        System.out.println("Inside female constructor");
    }
}

class HumanBeing{
    int age;
    int weight;

    void sleep(){
        System.out.println("sleeping");
    }

    void eat(){
        System.out.println("eating");
    }

    public HumanBeing(){
        System.out.println("Inside the no arg constructor");
    }
    public HumanBeing(int age, int weight){
        this();
        this.age = age;
        this.weight = weight;
        this.eat();

    }
    public HumanBeing(int age){
        System.out.println("one parameter");
        this.age = age;
    }

}

//multilevel inheritance //grandparent parent child
class Scorpio extends Mahindra{
    int seats;
}
class Mahindra extends Car{
    int rating;
    void intro(){
        System.out.println("This is Mahindra");
    }
}
class Car{
    String color;
    int weight;

    void runCar(){
        System.out.println("car running");
    }

    void breakCar(){
        System.out.println("car stops");
    }
}

//hierarchial inheritance //one parent many child
class Employee{
    int salary;
    String name;
}

class Intern extends Employee{

}

class FullTime extends Employee{

}

//Java does not support Multiple Inheritance and Hybrio Inheritance due to ambiguity