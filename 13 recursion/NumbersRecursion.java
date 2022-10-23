//  main function is the first function that gets called

//  all the function calls go into the stack memory, then :-
//1) while the function is not finished executing, it will remain in stack.
//2) when a function finishes executing, it is removed from the stack
// and the flow of program is restored to where that function was called.

//  main function is the first function that will go in the stack
//  and the last function that will come out of the stack.
//  That means program starts with main function and program is over when main is finished executing.

//A function that calls itself is known as a recursive function. And this technique is known as recursion.
//Base Condition is where recursion ends i.e., stop making new calls.

public class NumbersRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        //base condition
        if (n == 5){
            System.out.println(n);
            return;
        }

        System.out.println(n);
//        Recursive call
        print(n+1); //this is tail recursion //this is the last function call
    }
    //every function call is going to have its separate memory in the stack
//    if there is no base condition, function calls will keep happening, stack will be filled again and again.
//    As a result, after some time, memory of computer will exceed the limit
//    and this will give "stack overflow error".
}
