package org.example.baseball;

import org.example.baseball.domain.NumberGenerator;
import org.example.baseball.domain.Referee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Referee referee = new Referee();
        NumberGenerator generator = new NumberGenerator();
        List<Integer> computer = generator.createRandomNumbers();
        String result = "";
        while(!result.equals("3스트라이크")) {
            result = referee.compare(computer, askNumbers());
            System.out.println(result);
        }
    }

    public static List<Integer> askNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }

}
