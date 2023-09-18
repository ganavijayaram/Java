package List;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeuImp {
    public static void main(){
        ArrayDeque<String> queue = new ArrayDeque<>();

        //add throws exception if not successful
        queue.add("g1");
        queue.addFirst("g2");
        queue.addLast("g3");

        // return true on successfull insert
        queue.offer("g4");
        queue.offerFirst("g4");
        queue.offerLast("g4");

        //peek
        queue.peek();
        queue.peekFirst();
        queue.peekLast();

        //remove
        queue.remove("g3");
        queue.removeFirst();
        queue.removeLast();

        // returns and removes the first element
        queue.poll();
        queue.pollFirst();
        queue.pollLast();

        //Iterating
        Iterator<String> iterator = queue.iterator();
        while(iterator.hasNext()) {

        }
    }
}
