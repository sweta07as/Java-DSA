//Limitations of array:-
    //In general, we term arrays as a continuous memory allocation but internally, in Java, array is NOT a continuous memory allocation.
    //Arrays have a fixed size.

//ArrayList is efficient but its also limiting us.

//Linked List is not a continuous memory allocation i.e., they don't have index values so its elements cannot be accessed using indices
//Each item in a Linked List is known as a node.
//For every node, you are putting it in some random memory, connected with each other using reference varaible/pointer (i.e., next)
//There are two reference variables: i) Head: always pointing to the first node ii) Tail: always pointing to the last node.
//If their is only one item in Linked List, then head and tail, both will be that item only
//Time Complexity: O(n) where n is the number of nodes

import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        // Internal Linked List provided by java
//        LinkedList<Integer> list = new LinkedList<>();

        //Linked List
//        LL list = new LL();
//        list.insertAtFirstPosition(3);
//        list.insertAtFirstPosition(2);
//        list.insertAtFirstPosition(8);
//        list.insertAtFirstPosition(9);
//        list.insertAtLastPosition(7);
//        list.insert(100, 3);
//        list.display();
//        System.out.println(list.deleteAtFirstPosition());
//        System.out.println(list.deleteAtLastPosition());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();

        //Doubly LinkedList
//        DLL list = new DLL();
//        list.insertAtFirstPosition(3);
//        list.insertAtFirstPosition(2);
//        list.insertAtFirstPosition(8);
//        list.insertAtFirstPosition(9);
//        list.insertAtLastPosition(99);
//        list.insert(99, 300);
//        list.display();

        CLL list = new CLL();
        list.insert(23);
        list.insert(4);
        list.insert(17);
        list.insert(8);
        list.display();
        list.delete(17);
        list.display();
    }
}