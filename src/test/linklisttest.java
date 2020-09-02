package test;
import linear.linklist;

public class linklisttest {
    public static void main(String[] args) {
        linklist<String> s1=new linklist<>();
        s1.insert("yao");
        s1.insert("koubi");
        s1.insert("mai");

        for(String s:s1){
            System.out.println(s);
        }

        String re=s1.remove(0);
        System.out.println(re);

        System.out.println("-------------------------------------");
        s1.reverse();
        for(String s:s1){
            System.out.println(s);
        }
    }
}
