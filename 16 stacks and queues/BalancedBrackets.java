import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else if(ch == ')'){
                boolean val = handleClosing(st, '(');
                if(!val){
                    System.out.println(val);
                    return;
                }
            } else if(ch == '}'){
                boolean val = handleClosing(st, '(');
                if(!val){
                    System.out.println(val);
                    return;
                }
            }  else if(ch == ']'){
                boolean val = handleClosing(st, '(');
                if(!val){
                    System.out.println(val);
                    return;
                }
            }
        }
        if(st.size() == 0){
            System.out.println(true);
        } else{
            System.out.println(false); //extra opening bracket
        }
    }
    public static boolean handleClosing(Stack<Character> st, char corresOpenCh){
        if(st.size() == 0){ //extra closing bracket
            return false;
        } else if(st.peek() != corresOpenCh){ //bracket mismatch
            return false;
        } else{
            st.pop();
            return true;
        }
    }
}
