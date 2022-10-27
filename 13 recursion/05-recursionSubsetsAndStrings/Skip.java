public class Skip {
    public static void main(String[] args) {
//        skip1("", "baccad");
//        System.out.println(skip2("baccad"));
//        System.out.println(skipApple("bacaapplead"));
        System.out.println(skipAppNotApple("bacappead"));
    }

//here p is the processed/modified one AND up is unprocessed/original one

//    Skip a character

//There are two ways to skip a character:

// i) Pass the answer string in the argument (can be passed to future function calls)
    static void skip1(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip1(p, up.substring(1));
        } else{
            skip1(p + ch, up.substring(1));
        }
    }


//ii) Create the answer variable in the function body (for every function call, new variable is created)
    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip2(up.substring(1));
        } else{
            return ch + skip2(up.substring(1));
        }
    }

//    Skip a string
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        } else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

//    Skip a string if it's not the required string
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        } else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }

}
