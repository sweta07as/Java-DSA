public class StackMain {
    public static void main(String[] args) throws StackException{
//        CustomStack stack = new CustomStack(5);
//
//        stack.push(34);
//        stack.push(45);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);
//        stack.push(89);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        DynamicStack stack = new DynamicStack(5);
        //Here, we can also use:-
//        CustomStack stack = new DynamicStack(5);
        //data type of ref. variable tells what access you can get
        //data type of object tells type of the access you can get


        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(89);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
