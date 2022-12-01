package oops2.staticExample;
//Only nested classes can be static.

//Nested class depend on the object of its outer class.
//To make nested class independent of the object of the outer class, make the nested class static.

//Static inner classes have its properties static internally.

//Static methods are class level methods, so it is always resolved during compile time.

public class InnerClasses {

    static class Test{
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Sweta");
        Test b = new Test("Ananya");
//        System.out.println(a.name);
//        System.out.println(b.name);

        System.out.println(a);
    }
}
