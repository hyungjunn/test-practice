package org.example.baseball;

import org.example.baseball.domain.Judgement;
import org.example.baseball.domain.NumberGenerator;
import org.example.baseball.domain.Referee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

//        NumberGenerator generator = new NumberGenerator();
//
//        List<Integer> numbers = generator.createRandomNumbers();
//
//        System.out.println(numbers);

//        Judgement judgement = new Judgement();
//
//        List<Integer> computer = new ArrayList<>();
//
//        computer.add(9);
//        computer.add(8);
//        computer.add(7);
//
//        List<Integer> player = new ArrayList<>();
//
//        player.add(2);
//        player.add(3);
//        player.add(4);
//
//        System.out.println(judgement.correctCount(computer, player));

//        Judgement judgement = new Judgement();
//
//        System.out.println(judgement.correctCount(Arrays.asList(1,2,3), Arrays.asList(2, 3, 4)));
//
//        System.out.println(judgement.hasPlace(Arrays.asList(1,2,3), 1, 3));

//        Scanner scanner = new Scanner(System.in);
//        int input1 = scanner.nextInt();
//        int input2 = scanner.nextInt();
//        int input3 = scanner.nextInt();

        Referee referee = new Referee();
        System.out.println(referee.compare(Arrays.asList(3,4,5), Arrays.asList(3, 4, 5)));
    }
}
