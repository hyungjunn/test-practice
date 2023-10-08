package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.lang.Integer.parseInt;

public class NumberBaseball {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.makeNumber();

        InputView inputView = new InputView();

        int[] playerNumber = new int[3];
        String input = inputView.inputNumber();
        for (int i = 0; i < playerNumber.length; i++) {
            playerNumber[i] = parseInt(input.substring(i, i+1));
        }
    }
}

// 컴퓨터가 자신의 숫자와 플레이어의 숫자를 비교한다.
// 컴퓨터가 비교한 결과를 가지고 화면에 포볼,볼,스트라이크를 출력한다.
// 다 맞출때(3스트라이크)까지 반복한다.
// 3스트라이크가 되면 반복이 끝나고 컴퓨터가 "3개의 숫자를 모두 맞히셨습니다! 게임 종료"를 출력한다.
// 컴퓨터가 "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."를 출력한다.
// 플레이어가 1을 입력하면 처음부터 다시 시작한다.
// 플레이어가 2를 입력하면 완전히 종료된다.

