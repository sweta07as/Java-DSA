
//Scope is basically where we can access our variables.

//Function/Method Scope
//If you want to access anything that is available/defined in a function, you can only access
//those in that function only. You can't access outside the function. This is called scoping.
//This also holds true for the parameters of the function.

public class Scope {
    public static void main(String[] args) {
//        System.out.println(num);
//        System.out.println(marks);

        int a = 10;
        int b = 30;

        String name = "Sweta";

        //Block Scope   //Loop Scope
        //Values already initialized outside the block in the same method, cannot be initialized again, inside the block. However,
            // we can reassign the ORIGINAL reference variable to some other value, inside the block.
        //Values initialized in this block, will remain the block i.e., not accessible outside the block.

        {
//            int a = 76; //cannot be initialized again
            a = 32; //can get modified
            System.out.println(a);

            name = "Ananya";
            System.out.println(name);

            int c = 88;
            int d = 39;
        }

        System.out.println(a); //prints the reassigned value i.e., 32
        System.out.println(name);

//        System.out.println(c); //cannot use outside the block

        int d = 87; //Since the block scope of d is over, it has to be reinitialized for use

//    Loop Scope
        for (int i = 0; i < 4 ; i++) {
            System.out.println(i);
            int num = 90;
            a = 1000;
        }
//        System.out.println(i);
        System.out.println(a);


    }

    static void random(int marks){
//        System.out.println(a);
        int num = 46;
        System.out.println(num);
        System.out.println(marks);
    }

}
