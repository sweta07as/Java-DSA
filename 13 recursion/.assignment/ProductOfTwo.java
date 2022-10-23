public class ProductOfTwo {
    public static void main(String[] args) {
        System.out.println(prod(100, 5));
    }

    static int prod(int x, int y){
        if(y == 0){
            return 0;
        }
        return  x + prod(x, y-1);
    }
}
