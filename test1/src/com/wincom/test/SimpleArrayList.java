package com.wincom.test;

public class SimpleArrayList {
    private int size;
    private Object[] elementData = new Object[5];

    public void add(Object value) {
        elementData[size++] = value;
    }
//eeeeeeeeee
    public Object get(int idx) {
        return elementData[idx];
    }
}
