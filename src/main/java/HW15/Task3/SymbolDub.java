package HW15.Task3;

import java.util.HashMap;
import java.util.Map;

public class SymbolDub {
    public static void main(String[] args) {
        String string = "мячдомячмень";
        Map<Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if(!hashmap.containsKey(symbol)){
                hashmap.put(symbol,1);
            }else {
                Integer key = hashmap.get(symbol);
                key++;
                hashmap.put(symbol,key);
            }
        }
        System.out.println(hashmap);
    }
}