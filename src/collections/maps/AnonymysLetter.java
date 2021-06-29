package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class AnonymysLetter {
    public static void main(String[] args) {
        String magazine  = "54j3439*))*";

        String letters  = "q35*";

        Map<Character,Integer> map  = new HashMap<>();

        for(char ch : magazine.toCharArray()){
            map.put(ch,1);
        }

        boolean isFound = true;

        for(char letter : letters.toCharArray()){
            if(!map.containsKey(letter))
            {
                System.out.println("Not anonymous");
                isFound = false;
            }
        }

       if(isFound)
           System.out.println("Anonymoush letter");
    }
}
// collisions
// impl hashmap psuedo code
// insertion map
//