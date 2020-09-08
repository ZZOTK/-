package test;
import linear.stack;

public class stacktest {
    public static void main(String[] args) {
        stack<String> stack=new stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        for (String s:stack){
            System.out.println(s);
        }
        System.out.println("------------------------------");
        String result=stack.pop();
        System.out.println("弹出"+result);

    }
}
