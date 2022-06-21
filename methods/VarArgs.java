//Variable Length Arguments aka Varargs Method
//When you create a method that takes a variable number of arguments, it is known as Variable Arguments
//Used when we don't know how many inputs we are giving.

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {

//        fun(); prints empty array i.e., []
//        fun(3, 8, 7, 9, 2);

//        multiple(7, 14, "Sweta", "Neelam", "Ananya");

//        demo(2,3,4);
//        demo("Sweta", "Neelam", "Ananya");
//        demo(); //gives error in case of varargs method overloading
    }

//    Varargs Method
    static void fun(int ...v){
        //int ...v is internally taken as Array of Integers, where the array is named as v
        System.out.println(Arrays.toString(v));
    }

//    Multiple Arguments
    static void multiple(int a, int b, String ...c){
        //Vararg parameter must be the last in the list // (int a, String ...b, int c) gives error
    }

//    Method Overloading
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}

