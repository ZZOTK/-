package algorithm;

import linear.stack;

public class stack_nibolan {
    public static void main(String[] args) {
        //中缀表达式3*（17-15）+18/6的逆波兰表达式如下
        String[] notation = {"3", "17", "15", "-", "*","18", "6","/","+"};
        int result = caculate(notation);
        System.out.println("逆波兰表达式的结果为："+result);
    }

    public static int caculate(String[] notaion){
        stack<Integer> s=new stack<>();
        for(int i=0;i<notaion.length;i++){
            String curr = notaion[i];
            //判断为运算符或是数字
            Integer o1;
            Integer o2;
            Integer result;
            //运算符就pop出栈计算并结果入栈，数字就push入栈
            switch(curr){
                case "+":
                     o1=s.pop();
                     o2=s.pop();
                     result=o2+o1;
                     s.push(result);
                    break;
                case "-":
                    o1=s.pop();
                    o2=s.pop();
                    result=o2-o1;
                    s.push(result);
                    break;
                case "*":
                    o1=s.pop();
                    o2=s.pop();
                    result=o2*o1;
                    s.push(result);
                    break;
                case "/":
                    o1=s.pop();
                    o2=s.pop();
                    result=o2/o1;
                    s.push(result);
                    break;
                default:
                    s.push(Integer.parseInt(curr));
                    break;
            }

        }

        return s.pop();
    }
}
