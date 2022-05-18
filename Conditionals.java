public class Conditionals {
    public static void main(String[] args) {

        //Given below is a multi-line comment
        /*
       conditional is a statement that depends on a condition being true or false.

       Syntax of if statements:
       if(boolean expression that gives T or F) {
            //body
       } else {
            //do this
       }
         */

        int salary = 25400;
//        if (salary>10000) {
//            salary =salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }

        //multiple if-else
        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
    }