package oops2.staticExample;
//initialisation of static variables can be done via static{} block
//static{} block gets executed exactly once, when the class is first loaded.
public class StaticBlock {

    static int a = 4;
    static int b;

    //will only run once i.e., when the first object is created
    static{
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
