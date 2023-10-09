package org.example.number_baseball.view;

import java.util.Scanner;

public class InputView {

    private final String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요.";
    private final String RESET_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private final Scanner scanner = new Scanner(System.in);

    // 플레이어가 임의의 수 세 개를 뽑는다.
    public String enterGameNumber() {
        System.out.println(INPUT_NUMBER_MESSAGE);
        return scanner.nextLine();
    }

    // 플레이어가 게임을 다시 시작할지 말지 결정한다.
    public String enterRestartGame() {
        System.out.println(RESET_MESSAGE);
        return scanner.nextLine();
    }

}
