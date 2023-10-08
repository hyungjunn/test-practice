package org.example;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    // 플레이어가 임의의 수 세 개를 뽑는다.
    String inputNumber() {
        return scanner.nextLine();
    }

}
