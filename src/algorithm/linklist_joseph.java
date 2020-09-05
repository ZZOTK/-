package algorithm;

public class linklist_joseph {
    public static void main(String[] args) {
        //新建1—41的循环链表
        Node<Integer> first = null;
        Node<Integer> pre = null;
        for (int i=1;i<=41;i++){
            if (i==1) {
                first = new Node<>(i, null);
                pre = first;
                continue;
            }
            Node<Integer> newnode=new Node<>(i,null);
            pre.next=newnode;
            pre=newnode;
            if(i==41){
                pre.next=first;
            }
        }

        int count=0;
        Node n=first;
        Node before=null;
        while (n!=n.next.next){
            count++;
            if(count==3){
                count=0;
                before.next=n.next;
//                System.out.println(n.item);
                n=n.next;

            }else {
                before=n;
                n=n.next;
            }
        }
        System.out.println(n.item);
        System.out.println(n.next.item);

    }


    private static class Node<T> {
    //存储数据
    T item;
    // 下一个结点
    Node next;

    public Node(T item, Node next) {
        this.item = item;
        this.next = next;
    }
    }
}
