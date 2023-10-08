package org.example.number_baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

    // 컴퓨터가 임의의 수 세 개를 뽑는다.
    int[] makeNumber() {
        int[] computerNumber = new int[3];
        for (int i = 0; i < 3; i++) {
            computerNumber[i] = (int) (Math.random() * 9) + 1;
            for (int j = 0; j < i; j++) {
                if (computerNumber[i] == computerNumber[j]) {
                    i--;
                }
            }
        }
        return computerNumber;
    }

    boolean isSame(int a, int b) {
        if (a == b) {
            return true;
        }
        return false;
    }



}
