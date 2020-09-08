package algorithm;

import linear.stack;

public class stack_kuohaopipei {
    public static void main(String[] args) {
        String str = "(上海(长安)())";
        boolean match=isMatch(str);
        System.out.println("是否匹配"+match);
    }

    public static boolean isMatch(String str){
        stack<String> chars = new stack<>();
        for (int i = 0; i < str.length(); i++) {
            String c = str.charAt(i)+"";
            //转换为字符串
            //判断是否为（，是则入栈
            if(c=="("){
                chars.push(c);
            }
            //如果为），则出栈一个。出栈为null则不匹配
            else if(c=="）"){
                String p=chars.pop();
                if(p==null){
                    return false;
                }
            }
        }
        //遍历完成判断是否还有（未出栈
        if (chars.pop()==null){
            return true;
        }
        return false;
    }
}
