package org.example;

public class Box<T> {
    private T item; // 아직 type을 모른다.

    public Box(){}

    public Box(T item) {
        this.item = item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
