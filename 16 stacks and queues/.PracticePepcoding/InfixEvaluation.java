import jdk.dynalink.beans.StaticClass;

import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        String s = "1+2-(3/4-8)";
        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optrs = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '('){
                optrs.push(ch);
            } else if (Character.isDigit(ch)){
                opnds.push(ch - '0'); //char to int
            } else if (ch == ')'){
                while (optrs.peek() != '('){
                    char optor = optrs.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    int opvalue = operation(v1, v2, optor);
                    opnds.push(opvalue);
                }
                optrs.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while (optrs.size() > 0 && optrs.peek() != '(' && precedence(ch) <= precedence(optrs.peek())){
                    char optor = optrs.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    int opvalue = operation(v1, v2, optor);
                    opnds.push(opvalue);
                }
                optrs.push(ch);
            }
        }

        while (optrs.size() != 0){
            char optor = optrs.pop();
            int v2 = opnds.pop();
            int v1 = opnds.pop();

            int opvalue = operation(v1, v2, optor);
            opnds.push(opvalue);
        }
        System.out.println(opnds.peek());
    }
    public static int precedence(char oprtr){
        if (oprtr == '+'){
            return 1;
        } else if (oprtr == '-'){
            return 1;
        } else if(oprtr == '*'){
            return 2;
        } else {
            return 2;
        }
    }

    public static int operation(int v1, int v2, char oprtr ){
        if (oprtr == '+'){
            return v1+v2;
        } else if (oprtr == '-'){
            return v1-v2;
        } else if(oprtr == '*'){
            return v1*v2;
        } else {
            return v1/v2;
        }
    }
}
