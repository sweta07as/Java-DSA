import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
//Binary trees are those generic trees that have a maximum of 2 children i.e., they have 0 child or 1 child or 2 children
// Used in mathematical expressions
public class BinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair{
        Node node;
        int state;
        Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    public static Node constructor(Integer[] arr){
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int i = 0;
        while(st.size() > 0){
            Pair top = st.peek();
            if(top.state == 1){
                i += 1;
                if(arr[i] != null){
                    top.node.left = new Node(arr[i], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else{
                    top.node.left = null;
                }
                top.state += 1;
            } else if(top.state == 2){
                i += 1;
                if(arr[i] != null){
                    top.node.right = new Node(arr[i], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else{
                    top.node.right = null;
                }
                top.state += 1;
            } else{
                st.pop();
            }
        }
        return root;
    }

    public static void display(Node node){
        if(node == null){
            return; //for null pointer exception
        }

        //for self
        String str = "";
        str += node.left == null ? "." : node.left.data + ""; //to convert integer into string, concatenation with an empty string
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + ""; //to convert integer into string, concatenation with an empty string
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static int size(Node node){
        if(node == null){
            return 0;
        }
        int ls = size(node.left);
        int rs = size(node.right);

        return ls + rs + 1;
    }

    public static int sum(Node node){
        if(node == null){
            return 0;
        }
        int lsum = sum(node.left);
        int rsum = sum(node.right);

        return lsum + rsum + node.data;
    }
    public static int max(Node node)  {
        if(node == null){
            return Integer.MIN_VALUE;
        }

        int lm = max(node.left);
        int rm = max(node.right);
        int tm = Math.max(node.data, Math.max(lm, rm));

        return tm;
    }

    public static int height(Node node){ //in terms of edges
        if(node == null){
            return -1; // In case of nodes, return 0
        }
        int lh = height(node.left);
        int rh = height(node.right);
        int th = Math.max(lh, rh) + 1;

        return th;
    }

    //Pre Order Traversal
//    left side on euler's path
//    Node Left Right (NLR)
//    First is the root

    //In Order Traversal
//    between left side and right side on euler's path
//    Left Node Right (LNR)
//    In between is the root

    //Post Order Traversal
//    right side on euler's path
//    Left Right Node (LRN)
//    Last is the root

    public static void traversal(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data + " in preorder");
        traversal(node.left);
        System.out.println(node.data + " in inorder");
        traversal(node.right);
        System.out.println(node.data + " in postorder");
    }

    public static void levelOrder(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);

        while (q.size() > 0){
            int count = q.size();
            for (int i = 0; i < count; i++) {
                node = q.remove();
                System.out.print(node.data + " ");
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            System.out.println();
        }
    }

    public static void iterativePrePostInTraversal(Node node){
        Stack<Pair> st = new Stack<>();
        Pair rtp = new Pair(node, 1);
        st.push(rtp);

        String pre = "";
        String in = "";
        String post = "";

        while (st.size() > 0){
            Pair top = st.peek();
            if(top.state == 1){ //pre, state++, left child
                pre += top.node.data + " ";
                top.state += 1;

                if (top.node.left != null){
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                }
            } else if(top.state == 2){ //in, state++, right child
                in += top.node.data + " ";
                top.state += 1;

                if (top.node.right != null){
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                }
            } else { //post, pop
                post += top.node.data + " ";
                st.pop();
            }
        }
        System.out.println("Pre: " + pre);
        System.out.println("In: " + in);
        System.out.println("Post: " + post);
    }

//    static ArrayList<Integer> path;
    static ArrayList<Node> path;
    public static boolean nodeToRoot(Node node, int data){
        if(node == null){
            return false;
        }
        if(node.data == data){
//            path.add(node.data);
            path.add(node);
            return true;
        }
        boolean findInLeft = nodeToRoot(node.left, data);
        if(findInLeft){
//            path.add(node.data);
            path.add(node);
            return true;
        }
        boolean findInRight = nodeToRoot(node.right, data);
        if(findInRight){
//            path.add(node.data);
            path.add(node);
            return true;
        }
        return false;
    }

    public static void printKLevelsDown(Node node, int k){
        if(node == null || k < 0){
            return;
        }
        if(k == 0){
            System.out.println(node.data);
        }
        printKLevelsDown(node.left, k-1);
        printKLevelsDown(node.right, k-1);
    }

    public static void printKLevelsDown(Node node, int k, Node blocker){
        if(node == null || k < 0 || node == blocker){
            return;
        }
        if(k == 0){
            System.out.println(node.data);
        }
        printKLevelsDown(node.left, k-1, blocker);
        printKLevelsDown(node.right, k-1, blocker);
    }

    public static void printKNodesFar(Node node, int data, int k){
        path = new ArrayList<>();
        nodeToRoot(node, data);
        for (int i = 0; i < path.size(); i++) {
            printKLevelsDown(path.get(i), k-i, i == 0 ? null : path.get(i-1));
        }

    }

    public static void pathToLeafFromRoot(Node node, String path, int sum, int low, int high){
        if (node == null){
            return;
        }
        if (node.left == null && node.right == null){
            sum += node.data;
            if(sum >= low && sum <= high){
                System.out.println(path + node.data);
            }
            return;
        }
        pathToLeafFromRoot(node.left, path + node.data + " ", sum+ node.data, low, high);
        pathToLeafFromRoot(node.right, path + node.data + " ", sum+ node.data, low, high);
    }

    public static Node leftClonedTree(Node node){
        if(node == null){
            return null;
        }

        Node leftCloneRoot = leftClonedTree(node.left);
        Node rightCloneRoot = leftClonedTree(node.right);

        Node clone = new Node(node.data, leftCloneRoot, null);
        node.left = clone;
        node.right = rightCloneRoot;

        return node;
    }

    public static Node backFromLeftClonedTree(Node node){
        if(node == null){
            return null;
        }

        Node leftNormal = backFromLeftClonedTree(node.left.left);
        Node rightNormal = backFromLeftClonedTree(node.right);

        node.left = leftNormal;
        node.right = rightNormal;

        return node;
    }

    public static void singleChildNodes(Node node, Node parent){
        if(node == null){
            return;
        }
        if(parent != null && parent.left == node && parent.right == null){
            System.out.println(node.data);
        } else if(parent != null && parent.left == null && parent.right == node){
            System.out.println(node.data);
        }
        singleChildNodes(node.left, node);
        singleChildNodes(node.right, node);
    }

    public static Node removeLeaves(Node node){
        if(node == null){
            return null;
        }
        if(node.left == null && node.right == null){
            return null;
        }

        node.left = removeLeaves(node.left);
        node.right = removeLeaves(node.right);

        return node;
    }

    //Diameter of a Binary Tree:- Number of edges between two farthest nodes in the tree.
    public static int diameter1(Node node){ //O(N^2) approach
        if (node == null){
            return 0;
        }
        //max distance between two nodes of LHS
        int ld = diameter1(node.left);
        //max distance between two nodes of RHS
        int rd = diameter1(node.right);
        //max distance between left's deepest and right's deepest
        int f = height(node.left) + height(node.right) + 2;

        int dia = Math.max(f, Math.max(ld, rd));
        return dia;
    }


    static class DiaPair{
        int ht;
        int dia;
    }

    public static DiaPair diameter2(Node node){ //O(N) approach
        if(node == null){
            DiaPair bp = new DiaPair();
            bp.ht = -1;
            bp.dia = 0;
            return bp;
        }

        DiaPair lp = diameter2(node.left);
        DiaPair rp = diameter2(node.right);

        DiaPair mp = new DiaPair();
        mp.ht = Math.max(lp.ht, rp.ht) + 1;

        int f = lp.ht + rp.ht + 2;
        mp.dia = Math.max(f, Math.max(lp.dia, rp.dia));

        return mp;
    }


    static int tilt = 0;
    public static int tilt(Node node){  //return sum //change tilt
        if(node == null){
            return 0;
        }

        int ls = tilt(node.left);
        int rs = tilt(node.right);

        int localTilt = Math.abs(ls-rs);
        tilt += localTilt;

        int ts = ls + rs + node.data;
        return ts;
    }

    static boolean isBal = true;
    public static int isBalanced(Node node){
        if(node == null){
            return 0;
        }

        int lh = isBalanced(node.left);
        int rh = isBalanced(node.right);

        int gap = Math.abs(lh - rh);
        if(gap > 1){
            isBal = false;
        }

        int th = Math.max(lh, rh) + 1;
        return th;
    }

    static class BalPair{
        int ht;
        boolean isBal;
    }

    public static BalPair isBal(Node node){
        if(node == null){
            BalPair bp = new BalPair();
            bp.ht = 0;
            bp.isBal = true;
            return bp;
        }

        BalPair lp = isBal(node.left);
        BalPair rp = isBal(node.right);

        BalPair mp = new BalPair();
        mp.isBal = Math.abs(lp.ht - rp.ht) <= 1 && lp.isBal && rp.isBal;
        mp.ht = Math.max(lp.ht, rp.ht) + 1;
        return mp;
    }

    public static void main(String[] args) {
//        Information of a tree is given to its constructor by its euler's path (using array)
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        //displaying binary tree
        Node root = constructor(arr);
        display(root);

//        System.out.println(size(root));
//        System.out.println(sum(root));
//        System.out.println(max(root));
//        System.out.println(height(root));

//        traversal(root);
//        levelOrder(root);
//        iterativePrePostInTraversal(root);

//        path = new ArrayList<>();
//        System.out.println(nodeToRoot(root, 30));
//        System.out.println(path);
//        printKLevelsDown(root, 2);

//        printKNodesFar(root, 62, 2);

//        pathToLeafFromRoot(root, "", 0, 50, 100);

//        display(leftClonedTree(root));
//        display(backFromLeftClonedTree(root));

//        singleChildNodes(root, null);

//        display(removeLeaves(root));

//        System.out.println(diameter1(root));

//        DiaPair p = diameter2(root);
//        System.out.println(p.dia);

//        tilt(root);
//        System.out.println(tilt);

        isBalanced(root);
        System.out.println(isBal);
    }
}
