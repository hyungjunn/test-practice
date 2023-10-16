package org.example.baseball.domain;

import java.util.List;

public class Judgement {

    public int correctCount(List<Integer> computer, List<Integer> player) {
        int count = 0;
        for (int i = 0; i < computer.size(); i++) {
            if (player.contains(computer.get(i))) {
                count++;
            }
        }
        return count;
    }

    public boolean hasPlace(int placeNumber, int number) {
        return false;
    }

}
