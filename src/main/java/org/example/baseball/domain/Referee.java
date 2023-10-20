package org.example.baseball.domain;

import java.util.List;

public class Referee {
    public static int strike = 0;

    public String compare(List<Integer> computer, List<Integer> player) {

        Judgement judgement = new Judgement();
        int count = judgement.correctCount(computer, player);
        for (int i = 0; i < 3; i++) {
            if (count == 0) {
                return "낫싱";
            }

            if (count <= 3 && judgement.hasPlace(computer, i, player.get(i))) {
                strike++;
            }
        }

        return strike + "스트라이크 " + (count-strike) + "볼";
    }

}
