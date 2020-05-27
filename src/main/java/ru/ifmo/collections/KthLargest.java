package ru.ifmo.collections;


import java.util.Map;
import java.util.TreeMap;

/**
 * Design a class to find the kth largest element in a stream. k is from 1 to numbers.length.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * Constructor accepts an integer k and an integer array numbers, which contains initial elements from the stream.
 * For each call to the method KthLargest.add(), return the element representing the kth largest element in the stream.
 */
public class KthLargest {
    private int k;
    private TreeMap<Integer, Integer> map = new TreeMap<>();

    public KthLargest(int k, int[] numbers) {
        this.k = k;
        for (int number: numbers){
            this.map.put(number, 1);
        }
    }

    public int add(int val) {
        Integer temp = map.get(val);
        map.put(val, temp != null ? temp + 1 : 1);
        var tempMap = map.descendingMap();
        int rest = k;
        for (Map.Entry<Integer, Integer> entry : tempMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                rest--;
                if (rest == 0) {
                    return entry.getKey();
                }

            }
        }
        return 0;
    }
}