public class Nto1 {
    public static void main(String[] args) {
//        fun(5);
//        funRev(5);
//        funBoth(5);
        concept(5);
    }

    //Make sure to RETURN the result of a function call of the return type
    //if the return type is void, then you DON'T have to return function call

    static void concept(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
//        concept(n--); //infinite recursion //prints 5 only infinite times //stack overflow
        concept(--n); //gives 5 4 3 2 1
    }
    static void fun(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        fun(num - 1);
    }

    static void funRev(int num){
        if(num == 0){
            return;
        }
        funRev(num - 1);
        System.out.println(num);
    }

    static void funBoth(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        funBoth(num - 1);
        System.out.println(num);
    }
}
