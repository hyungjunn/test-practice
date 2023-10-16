package org.example.baseball;

import org.example.baseball.domain.Judgement;
import org.example.baseball.domain.NumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        Judgement judgement = new Judgement();

        System.out.println(judgement.correctCount(Arrays.asList(1,2,3), Arrays.asList(2, 3, 4)));

        System.out.println(judgement.hasPlace(Arrays.asList(1,2,3), 1, 3));

    }
}