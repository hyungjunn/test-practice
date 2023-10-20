package org.example.pracitce_generics;

public class NamingConventionsExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        System.out.println(stringBox.getData());

        NumericContainer<Integer> intContainer = new NumericContainer<>(10);
        System.out.println(intContainer.doubleValue());
    }
}

class NumericContainer<N extends Number> {
    private N value;

    public NumericContainer(N value) {
        this.value = value;
    }

    public double doubleValue() {
        return value.doubleValue();
    }

}
