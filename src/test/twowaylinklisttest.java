package test;

import linear.Twowaylinklist;
import linear.linklist;

public class twowaylinklisttest {
    public static void main(String[] args) {
        Twowaylinklist<String> s1=new Twowaylinklist<>();
        s1.insert("yao");
        s1.insert("koubi");
        s1.insert("mai");
        s1.insert(2,"z");

        for(String s:s1){
            System.out.println(s);
        }

        String re=s1.remove(1);
        System.out.println(re);
    }
}
