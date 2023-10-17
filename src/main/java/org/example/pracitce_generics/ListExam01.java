package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListExam01 {

    public static void main(String[] args) {
        // JDk 1.4 방식 으로 코딩.
        // Object를 파라미터로 받아들이고, Object를 리턴
        // List는 ArrayList의 인터페이스 혹은 부모클래스일꺼야?
        List list = new ArrayList();
        list.add("hello");
        list.add(Integer.valueOf(17));

        String str = (String)list.get(0);
        int i = (int) list.get(1);

        System.out.println(str);
        System.out.println(i);
    }
}
