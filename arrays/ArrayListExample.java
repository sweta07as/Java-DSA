import java.util.ArrayList;
import java.util.Scanner;
//Dynamic Array OR ArrayList
//Is a re-sizable array
//Is slower than the standard array
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);   //ArrayList is a class of Java Collection Framework
                                                                    //list is the ref variable pointing to the object
                                                                   //and Integer is the wrapper class for primitive data type int

//        ArrayList lists = new ArrayList(5); //you can skip <> part in both sides
                                                            //but this is not a good practice

        list.add(23);
        list.add(26);
        list.add(73);
        list.add(93);
        list.add(42);
        list.add(28);
        list.add(58);
        list.add(45);
        list.add(79);


        System.out.println(list); //toString method is called internally on its own in Arraylist
                                    //that's why we directly input ref variable in the parentheses

        System.out.println(list.contains(73));
        list.set(0,10); //replace item at any index
        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(2)); //get item at any index

        //input
        for (int i = 0; i < 5; i++) {
//            list.add(sc.nextInt());
        }

        //output
        for (int i = 0; i < 5; i++) {
//            System.out.println(list.get(i)); //list[index] syntax will not work here
        }

//        System.out.println(list); //easy way to output

        //Internally, size of ArrayList is fixed. But size is being changed when a particular capacity reaches.
    }
}
