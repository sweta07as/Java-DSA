//same as LL but one additional reference variable i.e., prev is added

//every single node has a next and a previous
//for head: previous is null always
//for tail: next is null always

//beneficial for backward traversal

//null pointer exception:-
    //null.next always gives error
    //null.prev always gives error
public class DLL {
    private Node head;
    //here, we are not providing tail
    public void insertAtFirstPosition(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        Node last = null; //here last is used as tail
        while (node != null){
            System.out.print(node.val + " -> ");
            last = node; //here last is used as tail
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse: ");
        while (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
    public void insertAtLastPosition(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    //insert(int val, int index) will be similar to that of LL, you just need to ALSO reassign the prev nodes

    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null; //not found
    }

    //Inserting a node after a given node
    public void insert(int after, int val){
        Node p = find(after);
        if(p == null){
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    //deletion is similar to that of LL
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
