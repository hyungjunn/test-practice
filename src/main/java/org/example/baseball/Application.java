package org.example.baseball;

import org.example.baseball.domain.Referee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Referee referee = new Referee();
        System.out.println(referee.compare(Arrays.asList(3, 4, 5), Arrays.asList(3, 4, 5)));

    }

    public static List<Integer> askNumbers() {
        System.out.print("숫자를 입력해주세요: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }

}
