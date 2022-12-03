package oppsByLB;
//Polymorphism means existing in many forms

//We can overload the main method in java
// but JVM only calls the original main method, it will never call our overloaded main method.
public class Polymorphism {
    public static void main(String[] args) {
        Calculate sum = new Calculate();
        sum.add(2,3,4);

        Cat billi = new Cat();
        billi.speak();
    }
}

//Compile Time Polymorphism
//If a class have multiple methods, having same name but diff (either number or type) parameters is called Mehtod Overloading
class Calculate{

    void add(int a, int b){
        System.out.println(a+b);
    }

    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

}

//Runtime Polymorphism //Method Overriding
//method should have same name and same parameter
//must do inheritance
class Cat extends Animal{
    @Override //this is just a tag/annotation //no use //improves readability and detects error
    void speak(){
        System.out.println("Meow");
    }
}
class Animal{
    int age;
    int weight;


    void speak(){
        System.out.println("Hii");
    }
}
