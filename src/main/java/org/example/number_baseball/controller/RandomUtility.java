package org.example.number_baseball.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomUtility {

    private static final int RANDOM_NUMBERS_SIZE = 3;
    private static final int MIN_NUMBERS = 1;
    private static final int MAX_NUMBERS = 9;


    public List<Integer> generateRandomNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < RANDOM_NUMBERS_SIZE; i++) {
            randomNumbers.add(generateRandomNumber(randomNumbers));
        }

        return randomNumbers;

    }

    private int generateRandomNumber(List<Integer> randomNumbers){
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(MIN_NUMBERS, MAX_NUMBERS+1);

            if (isDifferentNumber(randomNumbers, randomNumber)) {
                return randomNumber;
            }
        }
    }

    private boolean isDifferentNumber(List<Integer> randomNumbers, int randomNumber){
        return !randomNumbers.contains(randomNumber);
    }

}
