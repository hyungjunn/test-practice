package org.example.baseball;

import org.example.baseball.domain.NumberGenerator;

public class Application {
    public static void main(String[] args) {

        NumberGenerator numberGenerator = new NumberGenerator();

        System.out.println(numberGenerator.createRandomNumbers());

    }
}
