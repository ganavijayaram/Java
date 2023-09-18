package Map;

import java.util.TreeMap;

public class TreeMapImp {
    public static void main(){
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Entering the values
        treeMap.put(1, "One");
        treeMap.getOrDefault(2, "Seven");

        // Accessing the values
        treeMap.entrySet();
        treeMap.keySet();
        treeMap.values();

        // removing
        treeMap.remove(1);

        //
        treeMap.containsKey(1);
        treeMap.containsValue("one");

        //Navigation
        treeMap.firstEntry();
        treeMap.lastEntry();

        treeMap.higherKey(1);
        treeMap.higherEntry(1);
        treeMap.lowerEntry(1);
        treeMap.ceilingEntry(1);
        treeMap.floorEntry(1);




    }
}
