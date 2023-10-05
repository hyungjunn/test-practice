package org.example;

import java.util.Scanner;

public class StringCalculator1 {

    public static void main(String[] args) {
        StringCalculator1 stringCalculator1 = new StringCalculator1();

        System.out.println(stringCalculator1.doCalculations(stringCalculator1.input()));
    }

    // 1. 문자열을 입력한다
    private String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // 2. 빈 문자열인지 확인한다.
    boolean isEmpty(String input) {
        if (input=="" || input == null) {
            return true;
        }
        return false;
    }

    // 문자열을 나누는 기능.
    String[] splitInput(String string) {
        return string.split(" ");
    }

}
