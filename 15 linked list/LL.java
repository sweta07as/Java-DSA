//In singly linked list, every single item knows about the next item only
//In Singly Linked List, tail.next = null
public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    // obj1 = obj2 means both reference variables POINT to the same object (i.e., no new copy of any object is created)
    // Making a change in that object via one ref. variable will lead to the change in other ref. variable as well

    //MODIFICATION vs REASSIGNMENT
    //node.x = x VS node = node.next

    //Reassign means overwritten
    //Traversing means visiting each node of the list once in order to perform some operation on that.
    public void insertAtFirstPosition(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;        //if LL was initially empty i.e., first item is getting inserted
        if(tail == null){   //then head and tail would have been null
            tail = head;    //if their is only node in LL, then both head and tail points to that node
        }
        size += 1;
    }

    //Benefit of taking the extra variable "tail"
        //It takes O(1) i.e., constant time complexity in
        //inserting node at last position with the help of tail
    //Without tail, it will take O(n) time complexity using temp.next != null (as in display() function)
    public void insertAtLastPosition(int val){
        if(tail == null){
            insertAtFirstPosition(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertAtFirstPosition(val);
            return;
        }
        if(index == size){
            insertAtLastPosition(val);
            return;
        }
        Node temp = head; //0th index
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size += 1;

    }

    //deleted nodes get removed by garbage collector

    public int deleteAtFirstPosition(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size -= 1;
        return val;
    }

    public int deleteAtLastPosition(){
        if(size <= 1){
            return deleteAtFirstPosition();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteAtFirstPosition();
        }
        if(index == size - 1){
            return deleteAtLastPosition();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null; //not found
    }

    public void display(){
        Node temp = head; //scope of temp will be in the function only
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }

    private class Node{
        private int value;
        private Node next; //by default, it will be null

        public Node(int value) {
            this.value = value;
            //by default, object next will be null
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
