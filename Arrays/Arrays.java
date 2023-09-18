package Arrays;

import java.util.OptionalInt;
import java.util.*;

public class Arrays {
    public static void main(String args[]){
        int num  =4;
        int[] arr = new int[10];
        Integer[] arrInt = new Integer[10];
        arr[0] = 10;
        arr[1] = 20;

        int[] cloneArray = arr.clone();
        int len = arr.length;
        OptionalInt max = java.util.Arrays.stream(arr).max();
        //System.out.println(max.getAsInt());
        // Sorting array
        java.util.Arrays.sort(arr);
        // Binary Search
        java.util.Arrays.binarySearch(arr, num);
        // Equals
        java.util.Arrays.equals(arr, arr);
        java.util.Arrays.deepEquals(arrInt, arrInt);

    }
}
