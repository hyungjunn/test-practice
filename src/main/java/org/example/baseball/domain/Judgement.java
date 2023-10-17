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

    public boolean hasPlace(List<Integer> computer, int placeIndex, int number) {
        return (computer.get(placeIndex)).equals(number);
    }

}
