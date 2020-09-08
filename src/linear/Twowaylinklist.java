package linear;

import java.util.Iterator;

public class Twowaylinklist<T> implements Iterable<T> {
     private Node head;
     private Node last;
     private int N;



    private class Node{
         public Node(T item,Node pre, Node next){
             this.item=item;
             this.pre=pre;
             this.next=next;
         }

         public T item;
         public Node pre;
         public Node next;
     }

     public Twowaylinklist(){
          this.head=new Node(null,null,null);
          this.last=null;
          this.N=0;
     }
     public void clear(){
         this.head.next=null;
         this.last=null;
         this.N=0;
    }
    public boolean isempty(){
         return N==0;
    }
    public T getfirst(){
         if(N==0){
             return null;
         }
         return head.next.item;
    }
    public T getlast(){
         if(N==0){
             return null;
         }
         return last.item;
    }
    public void insert(T t){
         if(isempty()){
             Node newnode=new Node(t,head,null);
             last=newnode;
             head.next=last;
             N++;
         }else{
             Node newnode=new Node(t,last,null);
             last.next=newnode;
             last=newnode;
             N++;
         }
    }
    public void insert(int i,T t){
         Node pre=head;
         for(int index=0;index<i;index++){
             pre=pre.next;
         }
         Node las=pre;
         Node newnode=new Node(t,pre,las);
         pre.next=newnode;
         las.pre=newnode;
         N++;
    }
    public T get(int i){
         Node n=head.next;
         for(int index=0;index<i;index++){
             n=n.next;
         }
         return n.item;
    }
    public T remove(int i){
         Node pre=head;
         for (int index=0;index<i-1;index++){
             pre=pre.next;
         }
         Node cur=pre.next;
         Node nextnode=cur.next;
         nextnode.pre=pre;
         pre.next=nextnode;
         N--;
         return cur.item;
    }
    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }
    private class TIterator implements Iterator{
        private Node n;
        public TIterator(){
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
