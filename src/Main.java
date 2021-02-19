import java.util.Stack;

public class Main {

    public static void main(String[] args){

        Stack<String> stk= new Stack<>();

        stk.push("Ac");
        stk.push("Palabay");
        stk.push("Palabay");
        stk.push("Draku");

        System.out.println(stk.pop());
        System.out.println(stk);
    }
}

