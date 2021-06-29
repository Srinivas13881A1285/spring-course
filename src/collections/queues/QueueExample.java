package collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //FIFO
        //[1,2,3,4,5]// order of insertion and order of retrieval same
        //Stack. order of insertions revere of order retirval

        Queue<Integer> queue = new LinkedList<>();
        //interface                         //implemented class
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


//        System.out.println(queue.peek());
//        System.out.println(queue.peek());
//        System.out.println(queue.peek());

    }
}
