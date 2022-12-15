//Array implementation of Stack
public class CustomStack {
    protected int[] data; //we can also take it as private
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }

        ptr += 1;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
//        int removed = data[ptr];
//        ptr -= 1;
//        return removed;
        return data[ptr--];
    }

//    peek() method fetch the element present at the top of the Stack
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr]; //ptr always points element present at the top of the Stack
    }
    public boolean isFull() {
        return ptr == data.length - 1; //ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
