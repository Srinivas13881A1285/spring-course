package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(); // generic list java 1.0 1994

        arrayList.add(10);
        arrayList.add("Suresh");
        arrayList.add(true);
        arrayList.add('c');

        System.out.println(arrayList);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);

        System.out.println(numbers);



        //for
        //for-each
        //iterator

        //for each
        for(int n : numbers){
            System.out.println(n);
        }

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        ArrayList<String> names = new ArrayList<>();
        ArrayList<Character> chars = new ArrayList<>();


        //int    - Integer
        //char  - Character
        //String
        //float - Float
        //double - Double




    }
}
// ArrayList
// search fast\


// add remove slow
// 10  30 40


// LinkedList
// search slow
// add remove fast


//1  sg     2       g    3   ggg 4 ggg          5