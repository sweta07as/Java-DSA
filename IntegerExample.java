import java.util.Scanner;
// In java, we say functions as methods. Because if we have a function in a class, then it is
//called a method. And in Java we put everything in classes.

//dry means Don't Repeat Yourself

public class IntegerExample {

    //static means it does not depend on the object.
    //anything you want to use in static, also has to be static

    //main function is the first function that is going to run
    public static void main(String[] args) {
//        sum1(); //calling the function

//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20, 30);
        System.out.println(ans);
    }

    /*

  SYNTAX

  return_type name(arguments){
      //body
      return statement;
  }

   */


    static void sum1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is " + sum);
    }

    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        return sum; //return basically means this function will end i.e., function over i.e., will exit (come out of) this function
                    //that is why return statements are written at the end
//        System.out.println("This will never execute"); //won't execute
    }

    //To pass the value of numbers when you are calling the method in main(), we add parameters
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

}
