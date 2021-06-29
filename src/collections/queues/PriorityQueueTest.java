package collections.queues;

import com.sun.xml.internal.fastinfoset.stax.events.StAXEventAllocatorBase;
import comparator.Employee;
import comparator.SalaryComparator;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        //max heap -> always give max element
        // min heap -> always give min element
        int[] numbers = {3, 40, 12, 23, 45}; //min heap -> 12 //max heap - 45


//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();//min heap

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());//max heap

        for (int number : numbers) {
            priorityQueue.add(number);
        }

        while(!priorityQueue.isEmpty()){
            System.out.println("current queue :"+priorityQueue);
            System.out.println(priorityQueue.poll());
        }

        //Priority Queue = Queue + comparaor
        //elments wil be stored ino the queue based on some priority

        Employee employee1 = new Employee("Suresh", 20, 100);
        Employee employee2 = new Employee("Suman", 22, 1000);
        Employee employee3 = new Employee("Karthik", 25, 500);
        Employee employee4 = new Employee("Arjun", 19, 5000);


        PriorityQueue<Employee> priorityQueue1 = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue1.add(employee1);
        priorityQueue1.add(employee2);
        priorityQueue1.add(employee3);
        priorityQueue1.add(employee4);

        SalaryComparator salaryComparator = new SalaryComparator();
        PriorityQueue<Employee> priorityQueue2 = new PriorityQueue<>(salaryComparator.reversed());
        priorityQueue2.add(employee1);
        priorityQueue2.add(employee2);
        priorityQueue2.add(employee3);
        priorityQueue2.add(employee4);

        System.out.println(priorityQueue2.poll());


    }
}