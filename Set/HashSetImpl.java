package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImpl {
    public static void main(){
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSetTwo = new HashSet<>();

        // Adding
        hashSet.add(3);
        hashSet.add(2);

        // Iterating
        Iterator<Integer> iterator = hashSet.iterator();
        while(iterator.hasNext()){

        }

        // Removing
        hashSet.remove(2);

        //union
        hashSet.addAll(hashSetTwo);

        // Intersection
        hashSet.retainAll(hashSetTwo);

        // difference
        hashSet.removeAll(hashSetTwo);

        //subset
        hashSet.containsAll(hashSetTwo);




    }
}
