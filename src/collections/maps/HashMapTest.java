package collections.maps;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        // key value pairs
        //name and its phonenumber
        //Map
            // hashmap
           //  linkedhasmap
        // treemap
        //Entry map

        Map<String, Integer> map = new HashMap<>();
        map.put("Suresh",111);
        map.put("Srinivas",1010);
        map.put("Suresh",1000);

        System.out.println(map.get("Suresh"));;
        System.out.println(map.get("Srinivas"));;

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key+"---->"+map.get(key));

            int value = map.get(key);

            if(value == 100){
                map.put(key,1000);
            }
            map.put(key,0);
        }

        System.out.println(map);

        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }


        Map<Integer,String> idAndName = new TreeMap<>();

        idAndName.put(1000000,"Srinivas");
        idAndName.put(12,"Suresh");
        idAndName.put(121,"Suresh");
        idAndName.put(122,"Suresh");
        idAndName.put(123,"Suresh");
        idAndName.put(1222,"Suresh");

        System.out.println(idAndName);


        int size = idAndName.size();
        System.out.println(size);

        idAndName.remove(12);
        System.out.println();
    }


}

//class{
//String name;
//Integer phonenumber
// }


// int[] numbers = {1, 2, 3, 4, 1, 2, 4, 5, 7};
// 1 - 2
// 2 - 3
// 3 - 1
