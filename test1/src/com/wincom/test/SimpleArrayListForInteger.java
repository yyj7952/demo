package com.wincom.test;

public class SimpleArrayListForInteger {
    private int size;
    private int[] elementData = new int[5];

    public void add(int value) {
        elementData[size++] = value;
    }

    public int get(int idx) {
        return elementData[idx];
    }
}
