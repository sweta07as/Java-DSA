public class BalancedParenthesis {
    //Not working if string contains a single character
    public static void main(String[] args) {
        String exp = "[(])";
        System.out.println(check(exp));
    }

    static boolean check(String str){
        if(str.isEmpty()){
            return true;
        }

        char ch = str.charAt(0);

        if(ch == '{'){
            if(str.charAt(1) == ']' || str.charAt(1) == ')'){
                return false;
            }
        }

        if(ch == '['){
            if(str.charAt(1) == '{' || str.charAt(1) == '}' || str.charAt(1) == ')'){
                return false;
            }
        }

        if(ch == '('){
            if(str.charAt(1) != ')'){
                return false;
            }
        }
        return check(str.substring(1));
    }
}
