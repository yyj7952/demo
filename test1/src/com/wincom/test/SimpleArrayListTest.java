package com.wincom.test;

public class SimpleArrayListTest {
    public static void main(String[] args) {
        GenericArrayList<Integer> intList = new GenericArrayList<>();
        intList.add(1);
        intList.add(2);

        int intValue1 = intList.get(0); // 형변환이 필요없다
        int intValue2 = intList.get(1); // 형변환이 필요없다

        //String strValue = intList.get(0); // 컴파일에러 dssdfsads

        /*SimpleArrayList list = new SimpleArrayList();

        list.add("50");
        list.add("100");

        Integer value1 = (Integer) list.get(0);
        Integer value2 = (Integer) list.get(1);

        System.out.println(value1 + value2);*/
    }
}
