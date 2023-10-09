package org.example.number_baseball.view;

public class OutputView {

    private static final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public void printEndGame() {
        System.out.println(GAME_END_MESSAGE);
    }

    public void printHint(String hintMessage) {
        System.out.println(hintMessage);
    }

}
