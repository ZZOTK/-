package test;

import linear.queue;

public class queuetest {
    public static void main(String[] args) {
        queue<String> que = new queue<>();
        que.enqueue("a");
        que.enqueue("b");
        que.enqueue("c");
        que.enqueue("d");
        que.enqueue("e");

        for (Object str : que) {
            System.out.println(str);
        }
        System.out.println("------------------------------------");
        String result=que.dequeue();
        System.out.println(result);

    }
}
