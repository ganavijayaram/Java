package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapImp {
    public static void main() {
        HashMap<String, Integer> hashmap = new HashMap<>();

        // Putting and getting 1
        hashmap.put("1", 1);
        hashmap.get("2");
        hashmap.getOrDefault("2", 4);

        // Getting large number of values
        hashmap.values();
        hashmap.keySet();
        hashmap.entrySet();

        // replacing values
        hashmap.replace("1", 1111);

        // Removing values
        hashmap.remove("2");
        hashmap.remove("2", 1);

        // Contains
        hashmap.containsKey("2");
        hashmap.containsValue(2);

        // Iterating
        for(String key: hashmap.keySet()) {

        }

        for(Map.Entry<String, Integer> entry: hashmap.entrySet()) {

        }


    }
}
