package oppsByLB;
//Encapsulation is wrapping up of data members and functions in a single unit
//Fully Encapsulated Class: All the properties(data memebers) are private
//getter() and setter() are functions used to get and set values of private properties

//Encapsulation used for:-
//i) data hiding/security/validation purposes
//ii) creating read-only class (no setter)
//ii) creating write-only class (no getter)

import java.util.Scanner;

//Data Hiding means an outside person cannot access our internal data directly
//or our internal data should not go out directly
public class EncapsulationAbstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}

class Sample{
    private int age;
    private int weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

//Abstraction means to show essential details and hide non-essential details
//In Java, abstraction can be achieved by two ways:-
//i) using abstract class
//ii) interface

//abstract class is created by using "abstract" keyword
//abstract method: only declaration, no definition i.e., declared without implemention

//abstract class may or may not have all methods abstract, some of them can be concrete(normal) method too
//object of abstract class cannot be created
//child class of the abstract class is used to implement the abstract methods of abstract class

//Encapsulation used for:-
//i) reducing complexity of viewing things i.e., easy to understand
//ii) re-usability, readability, maintainability

abstract class Shape{
    String color;

    //constructor
    public Shape() {
        this.color = "White";
        System.out.println("Inside Shape Constructor");
    }

    //method
    public abstract int area();
}

class Square extends Shape{
    int side;

    public Square() {
        super(); //calls parent's constructor
        System.out.println("Inside Square Constructor");
        side = 4;
    }

    @Override
    public int area(){
        return side*side;
    }
}

//encapsulation vs abstraction

//Pure/100% Abstraction means ALL the methods in the abstract class are abstract
//Interface is used for Pure Abstraction
//child class of the Interface is used to implement the abstract methods of abstract class
//To create a child class of an Interface, instead of "extends", "implements" keyword is used
//Inteface supports Multiple Inheritance
interface Area{
    public void rectangle();
}

class CalArea implements Area{
    public void rectangle(){
        int l = 5;
        int b = 4;
        System.out.println("area" + l*b);
    }
}

//Interface VS Abstract Class
