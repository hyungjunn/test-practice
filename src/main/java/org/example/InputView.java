package org.example;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    int inputNumber() {
        return scanner.nextInt();
    }
}
