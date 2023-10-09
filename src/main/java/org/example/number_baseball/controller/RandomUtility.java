package org.example.number_baseball.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomUtility {

    public List<Integer> generateRandomNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            randomNumbers.add(generateRandomNumber(randomNumbers));
        }

        return randomNumbers;

    }

    private int generateRandomNumber(List<Integer> randomNumbers){
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(1, 10);

            if (isDifferentNumber(randomNumbers, randomNumber)) {
                return randomNumber;
            }
        }
    }

    private boolean isDifferentNumber(List<Integer> randomNumbers, int randomNumber){
        return !randomNumbers.contains(randomNumber);
    }

}
