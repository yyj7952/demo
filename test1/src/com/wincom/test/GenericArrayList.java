package com.wincom.test;

public class GenericArrayList<T extends Integer> {
    private Object[] elementData = new Object[5];
    private int size;
//ssss
    public void add(T value) {
        elementData[size++] = value;
    }

    public T get(int idx) {
        return (T) elementData[idx];
    }
}
