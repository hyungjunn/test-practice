package org.example.baseball;

import org.example.baseball.domain.Judgement;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        Judgement judgement = new Judgement();

        boolean place = judgement.hasPlace(Arrays.asList(7,8,9), 0, 7);

        System.out.println(place);
    }
}
