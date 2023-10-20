package org.example.pracitce_generics;

import org.example.pracitce_generics.Box;

public class BoxExam {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("hello");
        String str = box.getItem();
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.setItem(Integer.valueOf(100));
        int value = box2.getItem();

        System.out.println(value);
    }
}
