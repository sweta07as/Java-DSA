import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
//Till now, we have learnt data structures that store linear information i.e., array, arraylist, stack, queue, linkedlist

//Trees are those data structures that store hiearchical information
//Tree is represented by the root node
//Each node have two things :- i) data ii) arraylist of nodes i.e., children

//Leaves are the nodes which don't have a child
//Root is the node which don't have parent
//Ancestors are the parent and grandparent nodes of the node
//Descendant are the child and grandchild nodes of the node


public class GenericTrees {
    private static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(){

        }
        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node node){

        //for self i.e., node will print itself and its family
        String str = node.data + "-->";
        for (Node child : node.children) {
            str += child.data + ",";
        }
        str += ".";
        System.out.println(str);

        //for child i.e., children will print themselves and their families
        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node constructor(int[] arr) {

        //constructor
        Node root = null;
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == -1){
                st.pop();
            } else{
                Node temp = new Node();
                temp.data = arr[i];
                if (st.size() > 0){
                    st.peek().children.add(temp);
                } else{
                    root = temp;
                }
                st.push(temp);
            }
        }
        return root;
    }

    public static int size(Node node){
        int s = 0;
        for (Node child : node.children) {
            int cs = size(child);
            s = s + cs;
        }
        s = s + 1; //for self

        return s;
    }
    public static int max(Node node){
        int max = Integer.MIN_VALUE;
        for (Node child : node.children) {
            int cm = max(child);
            max = Math.max(cm, max);
        }
        max = Math.max(node.data, max);

        return max;
    }

    //Depth of a node is defined by the number of edges it is away from the root node.
    //Depth of the root node itself is zero
    //Height of a generic tree is the depth of the deepest node

    //Depth and Height can also be defined by the number of nodes
    //In case number of nodes, depth of the root node is one.

    public static int height(Node node){ //here, height is considered to be defined by edges
        int ht = -1; //initialized as ht = 0 , in case of being defined by number of nodes
        for (Node child : node.children) {
            int ch = height(child);
            ht = Math.max(ch, ht);
        }
        ht += 1; //for self

        return ht;
    }

//    Pre Order is when we cross the node through the left side on its euler's path i.e., before going deep into recursion.
//    In this traversal, node is always visited before its children. Here, root is the first one to be visited.

//    Post Order is when we cross the node through the right side on its euler's path i.e., while coming out of recursion.
//    In this traversal, node is always visited after its children.  Here, root is the last one to be visited.

    public static void traversals(Node node){
        System.out.println("Node Pre " + node.data);
        for (Node child : node.children) {
            System.out.println("Edge Pre " + node.data + "--" + child.data);
            traversals(child);
            System.out.println("Edge Post " + node.data + "--" + child.data);
        }
        System.out.println("Node Post " + node.data);
    }

    //Level Order Traversal
    public static void levelOrder(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);

        while(q.size() > 0){
            node = q.remove();
            System.out.print(node.data + " ");

            for (Node child : node.children) {
                q.add(child);
            }
        }
        System.out.println(".");
    }

    public static void levelOrderLinewise(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);

        Queue<Node> cq = new ArrayDeque<>();
        while(q.size() > 0){
            node = q.remove();
            System.out.print(node.data + " ");

            for (Node child : node.children) {
                cq.add(child);
            }

            if (q.size() == 0){
                q = cq;
                cq = new ArrayDeque<>();
                System.out.println();
            }
        }
    }

    //delimiter approach
    public static void levelOrderLinewise2(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        q.add(new Node(-1)); //used as a marker
        while(q.size() > 0){
            node = q.remove();
            if(node.data != -1){
                System.out.print(node.data + " ");

                for (Node child : node.children) {
                    q.add(child);
                }
            } else{
                if(q.size() > 0){
                    q.add(new Node(-1));
                    System.out.println();
                }
            }
        }
        System.out.println();
    }

    //count approach
    public static void levelOrderLinewise3(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);

        while(q.size() > 0){
            int cicl = q.size(); //children in current level

            for (int i = 0; i < cicl; i++) {
                node = q.remove();
                System.out.print(node.data + " ");

                for (Node child : node.children) {
                    q.add(child);
                }
            }
            System.out.println();
        }
    }

    //pair approach
    private static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
    public static void levelOrderLinewise4(Node node){
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(node, 1));

        int level = 1;
        while(q.size() > 0){
            Pair p = q.remove();
            if(p.level > level){
                level = p.level;
                System.out.println();
            }
            System.out.print(p.node.data + " ");
            for (Node child : p.node.children) {
                Pair cp = new Pair(child, p.level + 1);
                q.add(cp);
            }
        }
    }
    public static void levelOrderLinewiseZigzag(Node node){
        Stack<Node> s = new Stack<>();
        s.add(node);

        Stack<Node> cs = new Stack<>();
        int level = 1;

        while(s.size() > 0){
            node = s.pop();
            System.out.print(node.data + " ");

            if(level % 2 == 1){
                for (int i = 0; i < node.children.size(); i++) {
                    Node child = node.children.get(i);
                    cs.push(child);
                }
            } else{
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    Node child = node.children.get(i);
                    cs.push(child);
                }
            }
            if (s.size() == 0){
                s = cs;
                cs = new Stack<>();
                level += 1;
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

//  Information of a tree is given to its constructor by its euler's path (using array)
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        //displaying generic tree
        Node root = constructor(arr);
        display(root);

        //size of a generic tree
        System.out.println(size(root));

        //maximum in a generic tree
        System.out.println(max(root));

        //height of a generic tree
        System.out.println(height(root));

        traversals(root);
        levelOrder(root);

        levelOrderLinewise(root);
        levelOrderLinewiseZigzag(root);

        levelOrderLinewise2(root);
        levelOrderLinewise3(root);
        levelOrderLinewise4(root);
    }
}