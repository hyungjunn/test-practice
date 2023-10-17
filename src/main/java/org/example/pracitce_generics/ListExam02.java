package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListExam02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("1234");

        String str = list.get(0);
        String str2 = list.get(1);

        System.out.println(str);
        System.out.println(str2);
    }
}
