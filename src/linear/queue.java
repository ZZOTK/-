package linear;

import java.util.Iterator;

public class queue<T> implements Iterable {
    private Node head;
    private  Node last;
    private int N;



    private class Node{
        public T item;
        public Node next;

        public Node(T item,Node next){
            this.item=item;
            this.next=next;
        }
    }
    public queue(){
        this.head=new Node(null,null);
        this.last=null;
        this.N=0;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public void enqueue(T t){
        Node newnode = new Node(t, null);
        if (last==null){
            last=newnode;
            head.next=last;
        }else{
            last.next=newnode;
            last=newnode;
        }
        N++;
    }

    public T dequeue(){
        if (isEmpty()){
            return null;
        }
        Node pre=head.next;
        Node las=pre.next;
        head.next=las;
        N--;
        if (isEmpty()){
            last=null;
        }
        return pre.item;
    }
    @Override
    public Iterator iterator() {
        return new QIterator();
    }

    private class  QIterator implements Iterator{
        private Node n;

        public QIterator(){
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
}
