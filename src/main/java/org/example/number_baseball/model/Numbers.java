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

    private int strikeCount;
    private int ballCount;

    protected List<Number> numbers;

    public Numbers(){

    }

    public Numbers(String input) {
        this.numbers = generatePlayerNumber(input);
    }

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

    public List<Number> generatePlayerNumber(String input) {
        return Arrays.stream(input.split(""))
                .map(x -> new Number(Integer.parseInt(x)))
                .collect(Collectors.toList());
    }

    // 숫자가 1~9사이인지
    public boolean isBetween1And9(String input) {
        for (int i = 0; i < input.length(); i++) {
            return 1 <= input.charAt(i) && input.charAt(i) <= 9;
        }
        return false;
    }

    // 3자리 숫자인지
    private boolean isAppropriateLength(String input) {
        return input.length() == 3;
    }

    // 서로 다른 숫자인지 확인
    private boolean isDifferent(String input) {
        return Arrays.stream(input.split(""))
                .distinct()
                .count() < RANDOM_NUMBERS_SIZE;
    }

    // 서로 다른 숫자면 예외 던지기
    private void isDifferentNumber(String input) {
        if (isDifferent(input)) {
            throw new IllegalArgumentException("서로 다른 숫자를 입력해야 됩니다.");
        }
    }

    // 숫자만 있는지 확인
    private void isNumber(String input) {
        try {
            Arrays.stream(input.split(""))
                    .forEach(Integer::parseInt);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력할 수 있습니다.");
        }
    }

    // 스트라이크 개수 세기
    private void countStrike(int computerNumber, int playerNumber) {
        if (computerNumber == playerNumber) {
            strikeCount++;
        }
    }

    // 볼 개수 세기
    private void countBall(List<Integer> computerNumber, List<Integer> playNumber) {
        for (int i = 0; i < playNumber.size(); i++) {
            if (computerNumber.get(i) == playNumber.get(i % 3) && i != i % 3) {
                ballCount++;
            }
        }
    }
}

