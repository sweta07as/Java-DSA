//Method Overloading
//same name, diff (no. OR type of) parameters
//At compile time, its decided which method to run

public class Overloading {
    public static void main(String[] args) {
        fun(34);
        fun("Sweta");
        int ans = sum(2,5,6);
        System.out.println(ans);
    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }


    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
}
