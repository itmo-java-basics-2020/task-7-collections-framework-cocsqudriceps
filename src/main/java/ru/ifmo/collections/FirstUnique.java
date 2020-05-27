package ru.ifmo.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Design a class which contains integers and returns first unique integer (in order of addition).
 * FirstUniqueTest can be used as an example.
 */
public class FirstUnique {
    private List<Integer> arr = new ArrayList<>();

    public FirstUnique(int[] numbers) {
        for (int number : numbers) {
            this.arr.add(number);
        }
    }

    public int showFirstUnique() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (Integer number : arr) {
            if (array.contains(number)) {
                array.remove(number); // Мне здесь нужно явным способов указывать , что это не индекс а обьект.
            } else {
                array.add(number);
            }
        }
        return !array.isEmpty() ? array.get(0) : -1;
    }

    public void add(int value) {
        arr.add(value);
    }
}
