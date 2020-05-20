package ru.ifmo.collections;

import java.util.ArrayList;

/**
 * Design a class which contains integers and returns first unique integer (in order of addition).
 * FirstUniqueTest can be used as an example.
 */
public class FirstUnique {
    private ArrayList<Integer> arrayList = new ArrayList();

    public FirstUnique(int[] numbers) {
        for (int number : numbers) {
            this.arrayList.add(number);
        }
    }

    public int showFirstUnique() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int number : arrayList) {
            if (array.contains(number)) {
                array.remove(Integer.valueOf(number));
            } else {
                array.add(number);
            }
        }
        return !array.isEmpty() ? array.get(0) : -1;
    }

    public void add(int value) {
        arrayList.add(value);
    }
}
