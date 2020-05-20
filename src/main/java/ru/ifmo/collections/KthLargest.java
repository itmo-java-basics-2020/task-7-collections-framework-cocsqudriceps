package ru.ifmo.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Design a class to find the kth largest element in a stream. k is from 1 to numbers.length.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * Constructor accepts an integer k and an integer array numbers, which contains initial elements from the stream.
 * For each call to the method KthLargest.add(), return the element representing the kth largest element in the stream.
 */
public class KthLargest {
    private int k;
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public KthLargest(int k, int[] numbers) {
        this.k = k - 1;
        for (int number: numbers) {
            arrayList.add(number);
        }
    }

    public int add(int val) {
        arrayList.add(val);
        Collections.sort(arrayList, Collections.reverseOrder());
        return arrayList.get(k);
    }
}