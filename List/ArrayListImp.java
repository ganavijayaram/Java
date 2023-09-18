package List;

import java.util.ArrayList;

public class ArrayListImp {
    public static void main(String args[]) {
        ArrayList<Integer> intArr = new ArrayList<>();
        ArrayList<Integer> newIntArr = new ArrayList<>();
        ArrayList<String> stringArr = new ArrayList<>();

        // adding elements to arraylist
        intArr.add(1);
        newIntArr.addAll(intArr);

        // Clear
        intArr.clear();

        // Clone -  shallow copy
        intArr.clone();

        // Contains
        intArr.contains(1);

        // get at index
        intArr.get(0);

        // IndexOf
        intArr.indexOf(1);

        // removeAll in intArr which are present in the newIntArr
        intArr.removeAll(newIntArr);

        // remove
        intArr.remove(0);

        // size
        intArr.size();

        // isEmpty
        intArr.isEmpty();

        // subList
        intArr.subList(0,1);

        // set
        intArr.set(0, 2);

    }
}
