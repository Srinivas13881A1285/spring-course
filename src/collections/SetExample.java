package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // Set

        // no insertion order no duplicates
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(100);
        hashSet.add(100);
        hashSet.add(200);

        boolean isHashEmpty = hashSet.isEmpty();
        System.out.println("isHashEmpty = " + isHashEmpty);

        // get method

      for (Integer a : hashSet){
          System.out.println(a);
      }


//        System.out.println(hashSet);

        //HashSet
        //LinkedHashSet
        //TreeSet

        //insertion order and no duplicaes
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(100);
        linkedHashSet.add(200);
        linkedHashSet.add(10);
        linkedHashSet.add(100);


        System.out.println(linkedHashSet);


        // sorted an no duplicates
        TreeSet<Integer> sorted = new TreeSet<>();
        sorted.add(10000);
        sorted.add(10);
        sorted.add(10);
        sorted.add(100);
        System.out.println(sorted);
    }
}
