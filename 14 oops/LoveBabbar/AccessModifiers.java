package oppsByLB;
//import makes only those items within the package that are declared as public available outside the package

//Access Modifiers specifies the scope the of a field (data member), method, constructor, or class.
//private: can be accessed only within the same class in which it is declared
//default: can be accessed only within the same package(folder or directory)
//public: can be accessed by any class of any package within the source folder
//protected: can be accessed :- within the same package by any class AND outside the package by child class object only

//File name is same as the name of the public class
//That's why there can be only one public class in a file. // otherwise it gives compile time error
public class AccessModifiers {
    public static void main(String[] args) {
        Student obj = new Student();

    }
}

class Student{
    int roll; //default
    public String name;
    private int age;
    protected int marks;
}
