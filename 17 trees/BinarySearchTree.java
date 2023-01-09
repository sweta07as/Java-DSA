import java.util.ArrayList;
import java.util.Stack;

public class BinarySearchTree {
//    Binary Search Trees (BST) are those binary trees in which for every parent node, the left child node
//    is smaller than the parent node AND the right child node is greater than the parent node.

//    In BST, for every node, it should be greater (or equal to) than LHS nodes and smaller (or equal to) than RHS nodes.

//    makes searching faster
//    makes the complexity of searching O(log N)

//    Functions related to the structure of the tree are same in BT as well as in BST
//    BST makes the functions related to value more optimal i.e., O(log N) instead of O(N)

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

    public static Node constructor(int[] arr, int l, int h){
        if(l > h){
            return null;
        }
        int mid = (l + h) / 2;
        int data = arr[mid];
        Node lc = constructor(arr, l, mid-1);
        Node rc = constructor(arr, mid + 1, h);

        Node node = new Node(data, lc, rc);
        return node;
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

    public static int max(Node node){
        if(node.right != null){
            return max(node.right);
        } else{
            return node.data;
        }
    }
    public static int min(Node node){
        if(node.left != null){
            return min(node.left);
        } else{
            return node.data;
        }
    }

    //Number of levels is directly proportional to log N
    public static boolean find(Node node, int data){ //Time Complexity: O(log N)
        if(node == null){
            return false;
        }

        if(data > node.data){
            return find(node.right, data);
        } else if(data < node.data){
            return find(node.left, data);
        } else {
            return true;
        }
    }

    public static Node add(Node node, int data){
        if(node == null){ //the added node is always a leaf node
            return new Node(data, null, null);
        }
        if(data > node.data){
            node.right = add(node.right, data);
        } else if (data < node.data) {
            node.left = add(node.left, data);
        } else{
            //nothing to do
        }
        return node;
    }

    public static Node remove(Node node, int data){
        if (node == null){
            return null;
        }

        if(data > node.data){
            node.right = remove(node.right, data);
        } else if(data < node.data){
            node.left = remove(node.left, data);
        } else {
            //after searching, if found, then we have the following cases :-
            if(node.left != null && node.right != null){
                int lmax = max(node.left);
                node.data = lmax;
                node.left = remove(node.left, lmax);
                return node;
            } else if (node.left != null) {
                return node.left;
            } else if (node.right != null) {
                return node.right;
            } else {
                return null;
            }
        }
        return node;
    }

    static int sum = 0;
    public static void sumOfLarger(Node node){
        if(node == null){
            return;
        }
        sumOfLarger(node.right);

        int old = node.data;
        node.data = sum;
        sum += old;

        sumOfLarger(node.left);
    }

    public static int lowestCommonAncestor(Node node, int d1, int d2){
        if(d1 < node.data && d2 < node.data){
            return lowestCommonAncestor(node.left, d1, d2);
        } else if(d1 > node.data && d2 > node.data){
            return lowestCommonAncestor(node.right, d1, d2);
        } else{
            return node.data;
        }
    }

    public static void printInRange(Node node, int d1, int d2){
        if(node == null){
            return;
        }
        if(d1 < node.data && d2 < node.data){
            printInRange(node.left, d1, d2);
        } else if(d1 > node.data && d2 > node.data){
            printInRange(node.right, d1, d2);
        } else {
            printInRange(node.left, d1, d2);
            System.out.println(node.data);
            printInRange(node.right, d1, d2);
        }
    }

    public static void targetSumPair(Node root, Node node, int target){
        if(node == null){
            return;
        }

        targetSumPair(root, node.left, target);

        int comp = target - node.data;
        if(node.data < comp){
            if(find(root, comp)){
                System.out.println(node.data + " " + comp);
            }
        }

        targetSumPair(root, node.right, target);
    }

    public static void tsp2(Node node, ArrayList<Integer> list){
        if(node == null){
            return;
        }
        tsp2(node.left, list);
        list.add(node.data);
        tsp2(node.right, list);
    }


    public static class IterativePair{
        Node node;
        int state = 0;

        IterativePair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    public static void tsp3(Node node, int tar){
        Stack<IterativePair> ls = new Stack<>();
        Stack<IterativePair> rs = new Stack<>();

        ls.push(new IterativePair(node, 0));
        rs.push(new IterativePair(node, 0));

        Node left = getNextFromNormalInorder(ls);
        Node right = getNextFromReverseInorder(rs);

        while (left.data < right.data){
            if(left.data + right.data < tar){
                left = getNextFromNormalInorder(ls);
            } else if(left.data + right.data > tar){
                right = getNextFromReverseInorder(rs);
            } else{
                System.out.println(left.data +  " " + right.data);
                left = getNextFromNormalInorder(ls);
                right = getNextFromReverseInorder(rs);
            }
        }
    }

    public static Node getNextFromNormalInorder(Stack<IterativePair> st){
        while(st.size() > 0){
            IterativePair top = st.peek();
            if (top.state == 0) {
                if(top.node.left != null){
                    st.push(new IterativePair(top.node.left, 0));
                }
                top.state += 1;
            } else if (top.state == 1) {
                if(top.node.right != null){
                    st.push(new IterativePair(top.node.right, 0));
                }
                top.state += 1;
                return top.node;
            } else{
                st.pop();
            }
        }
        return null;
    }

    public static Node getNextFromReverseInorder(Stack<IterativePair> st){
        while(st.size() > 0){
            IterativePair top = st.peek();
            if (top.state == 0) {
                if(top.node.right != null){
                    st.push(new IterativePair(top.node.right, 0));
                }
                top.state += 1;
            } else if (top.state == 1) {
                if(top.node.left != null){
                    st.push(new IterativePair(top.node.left, 0));
                }
                top.state += 1;
                return top.node;
            } else{
                st.pop();
            }
        }
        return null;
    }

    public static class BSTPair{
        boolean isBST;
        int min;
        int max;

        //largest BST subtree //lbs
        Node lbsRoot;
        int lbsSize;

    }

    public static BSTPair isBST(Node node){
        if (node == null){
            BSTPair bp = new BSTPair();
            bp.min = Integer.MAX_VALUE;
            bp.max = Integer.MIN_VALUE;
            bp.isBST = true;

            //largest BST subtree //lbs
            bp.lbsRoot = null;
            bp.lbsSize = 0;
            //

            return bp;
        }
        BSTPair lp = isBST(node.left);
        BSTPair rp = isBST(node.right);

        BSTPair mp = new BSTPair();
        mp.isBST = lp.isBST &&  rp.isBST && (node.data >= lp.max && node.data <= rp.min);
        mp.min = Math.min(node.data, Math.min(lp.min, rp.min));
        mp.max = Math.max(node.data, Math.max(lp.max, rp.max));

        //largest BST subtree //lbs
        if(mp.isBST){
            mp.lbsRoot = node;
            mp.lbsSize = lp.lbsSize + rp.lbsSize + 1;
        } else if(lp.lbsSize > rp.lbsSize){
            mp.lbsRoot = lp.lbsRoot;
            mp.lbsSize = lp.lbsSize;
        } else{
            mp.lbsRoot = rp.lbsRoot;
            mp.lbsSize = rp.lbsSize;
        }
        //
        return mp;
    }

    public static void main(String[] args) {
        int[] arr = {12, 25, 37, 50, 62, 75, 87}; //sorted array //inorder
        Node root = constructor(arr, 0, arr.length - 1);
        display(root);

        System.out.println(max(root));
        System.out.println(min(root));
        System.out.println(find(root, 65));

        add(root,45);
//        display(root);

        remove(root,45);
//        display(root);

//        sumOfLarger(root);
//        display(root);

//        System.out.println(lowestCommonAncestor(root, 12, 62));

//        printInRange(root, 27, 72);

//        targetSumPair(root, root, 100);

//        ArrayList<Integer> list = new ArrayList<>();
//        tsp2(root, list);
//        int data = 100;
//        int leftIndex = 0;
//        int rightIndex = list.size() - 1;
//        while (leftIndex < rightIndex){
//            int left = list.get(leftIndex);
//            int right = list.get(rightIndex);
//            if(left + right < data){
//                leftIndex += 1;
//            } else if(left + right > data){
//                rightIndex -= 1;
//            } else{
//                System.out.println(left + " " + right);
//                leftIndex += 1;
//                rightIndex -= 1;
//            }
//        }

//        tsp3(root, 100);

        BSTPair bp = isBST(root);
//        System.out.println(bp.isBST);
        System.out.println(bp.lbsRoot.data + "@" + bp.lbsSize);
    }

}
