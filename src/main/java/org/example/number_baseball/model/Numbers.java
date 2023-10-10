package org.example.number_baseball.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Numbers {

    private static final int RANDOM_NUMBERS_SIZE = 3;
    private static final int MIN_NUMBERS = 1;
    private static final int MAX_NUMBERS = 9;

    public List<Integer> generateComputerNumbers() {
        List<Integer> computerNumbers = new ArrayList<>();
        for (int i = 0; i < RANDOM_NUMBERS_SIZE; i++) {
            computerNumbers.add(generateComputerNumber(computerNumbers));
        }
        return computerNumbers;
    }

    private int generateComputerNumber(List<Integer> computerNumbers) {
        Random random = new Random();
        while (true) {
            int computerNumber = random.nextInt(MIN_NUMBERS, MAX_NUMBERS + 1);

            if (isDifferentNumber(computerNumbers, computerNumber)) {
                return computerNumber;
            }
        }
    }

    private boolean isDifferentNumber(List<Integer> randomNumbers, int randomNumber) {
        return !randomNumbers.contains(randomNumber);
    }

    private List<Integer> generatePlayerNumber(String input) {
        return Arrays.stream(input.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    // 숫자가 1~9만 가능
//    private boolean validatePlayerNumber(String input) {
//        for (int i = 0; i < input.length(); i++) {
//            if (isBetween1And9(input.charAt(i))) {
//                return true;
//            }
//        }
//        return false;
//    }

    private boolean isBetween1And9(String input) {
        for (int i = 0; i < input.length(); i++) {
            return 1 <= input.charAt(i) && input.charAt(i) <= 9;
        }
        return false;
    }

}
