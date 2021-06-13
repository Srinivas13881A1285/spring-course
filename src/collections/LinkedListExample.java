package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Search = ArrayList
        // Insertion Deletions = LinkedList
        // List Preserved

        List arrayList = new ArrayList<>();
        arrayList.add(10);//Integer
        arrayList.add("Suresh");//String
        arrayList.add(true);//Boolean



        for (Object o : arrayList) {
            System.out.println(o+" "+o.getClass().getName());;
        }


//        for (Object o : arrayList) {
//            if(o instanceof  newInstance)
//            {
//                Employee e = (Employee)o;
//                e.
//
//            }else if(o instanceof Student){
//
//            }else if(o instanceof Person){
//
//            }
//
//        }

        // Set
        // no order preserved
        // no duplicates

        // HashSet, LinkedHashSet TreeSet

        // Object is super class in java
        //
        // Poly
        //List

        List list = new ArrayList();
        List list2 = new LinkedList();


        LinkedList linkedList = new LinkedList();
        linkedList.add(100);
        linkedList.add("temp");
        linkedList.add(false);

        linkedList.get(0);



        boolean isPresent = linkedList.contains(100);
        System.out.println("isPresent = " + isPresent);


        print(arrayList);
        print(linkedList);

//        print(null);

        //Shallow copy
        //Deep copy


        // A      B
    }


    public static void print(List arrayList){
        if(arrayList == null)
            return;
        for (Object integer : arrayList) {
            System.out.println(integer);
        }
    }

    // spring boot
    // post get
    ///p


}


