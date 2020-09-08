package linear;

import java.util.Iterator;

public class stack<T>implements Iterable<T> {
    private Node head;
    private int N;


    private class Node{
        public T item;
        public Node next;

        public Node( T item,Node next){
            this.item=item;
            this.next=next;
        }
    }
    public stack(){
        this.head=new Node(null,null);
        this.N=0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public void push(T t){
        Node old=head.next;
        Node newNode=new Node(t,null);
        head.next=newNode;
        newNode.next=old;
    }

    public T pop(){
        Node old = head.next;
        if(old==null){
            return null;
        }
        head.next=old.next;
        N--;
        return old.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }
    private class SIterator implements Iterator{
        private Node n;
        public SIterator(){
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
