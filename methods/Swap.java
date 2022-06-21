
// In java, there is no particular thing known as "pass by reference".
// In java, there is only "pass by value". Value of reference variable is passed.

//Strings are immutable. Immutable simply means unmodifiable or unchangeable.

//For primitives, it's just passing value. Hence, the original values doesn't change.
//For objects i.e., non-primitives, it's passing value of the reference variables.
// Hence, original values change.

//If you want to access anything that is available/defined in a function, you can only access
//those in that function only. You can't access outside the function. This is called scoping.


public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);

        String name = "Sweta Agrawal";
        changename(name);
        System.out.println(name);
    }

    static void changename(String naam) {
        naam = "Ananya Sharan"; //creates a new string object
    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

//        this change will only be valid in this function scope only.
    }

}
