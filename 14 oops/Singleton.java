package oops2.singleton;
//In singleton class, only one object is allowed.
//Constructor cannot be accessed outside the singleton class
//Since you cannot call the constructor, you cannot create new objects.
public class Singleton {

    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        //check whether one object is created or not
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
