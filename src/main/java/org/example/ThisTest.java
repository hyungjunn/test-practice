package org.example;

public class ThisTest {

    Runnable r = () -> {
        System.out.println(this);
    };

    @Override
    public String toString() {
        return "R";
    }

    public static void main(String[] args) {

        ThisTest thisTest = new ThisTest();
        System.out.println(thisTest.r.equals(thisTest));
    }
}

