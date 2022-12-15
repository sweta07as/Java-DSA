import java.util.*;
//STACK AND QUEUES are ADT
//abstract data types ADT : it is given what it does but the internal implementation is hidden from us.
//
//        STACK
//        LIFO FILO
//        it adds and removes only from the top of the stack
//        push means add one item in the stack (removal)
//        pop means remove one item from the stack (insertion)
//
//        QUEUE
//        FIFO LILO
//        insertion at the end, removal at the beginning

//stack is a class
//queue is an interface

//Internally, stack are also arrays
//Internally, queue are also linked list


//In general, stacks and queues are used to store answers/results so far

//doubly ended queue is deque (pronounced as deck)
//i.e., insertion and removal is possible from both the sides (i.e., front and back)
//methods include add, offer, remove, poll, element, peek
//Deque is an interface which uses ArrayDeque class to create objects
//ArrayDeque class is likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.

public class InbuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(45);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop()); //if stack is empty, it gives EmptyStackException

        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(6);
//        queue.add(5);
//        queue.add(19);
//        queue.add(1);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(9);
        deque.addFirst(45);
        deque.addLast(35);
        System.out.println(deque.removeFirst());

    }
}