package org.example.baseball.domain;

import java.util.List;

public class Referee {
    public String compare(List<Integer> computer, List<Integer> player) {

        Judgement judgement = new Judgement();
        int count = judgement.correctCount(computer, player);
        int strike = 0;
        for (int i = 0; i < 3; i++) {

            if (count == 0) {
                return "낫싱";
            }

            if(count <= 3 && judgement.hasPlace(computer, i, player.get(i))) {
                strike++;
            }
        }
        // correctCount가 3일 때
        // ture가 몇 개 인지에 따라 나눔

        return strike + "스트라이크 " + (count - strike) + "볼";
    }
}
