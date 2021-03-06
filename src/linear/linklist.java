package linear;

import java.util.Iterator;

public class linklist<T> implements Iterable<T>{
    private Node head;
    private int N;



    private class Node{
        T item;
        Node next;

        public Node(T item,Node next){
            this.item=item;
            this.next=next;
        }
    }

    public linklist(){
        this.head=new Node(null,null);
        this.N=0;
    }

    public void clear(){
        head.next=null;
        this.N=0;
    }

    public int length(){
        return N;
    }
    public void insert(T t){
        Node n=head;
        while(n.next!=null){
            n=n.next;
        }
        Node newnode =new Node(t,null);
        n.next=newnode;
        N++;
    }
    public T remove(int i){
        Node pre=head;
        for(int index=0;index<i;index++){
            pre=pre.next;
        }
        Node curr=pre.next;
        Node nextnode= curr.next;
        pre.next=nextnode;
        N--;
        return curr.item;
    }
    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }
    private class LIterator implements Iterator{
        private Node n;
        public LIterator(){
            this.n=head;
        }

        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n=n.next;
            return n.item;
        }
    }
    //单链表反转
    public void reverse(){
        if(N==0){
            return;
        }
        reverse(head.next);
    }
    //反转指定节点
    public Node reverse(Node curr){
        if (curr.next==null){
            head.next=curr;
            return curr;
        }
        //curr的后一个节点，反转后变为pre
        Node pre = reverse(curr.next);
        //pre指向cur
        pre.next= curr;
        curr.next=null;
        return curr;
    }

}
