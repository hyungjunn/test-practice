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
    static boolean isEmpty(String input) {
        if (input.equals(" ") || input == null) {
            return true;
        }
        return false;
    }

    // 문자열을 나누는 기능.
    static String[] splitInput(String string) {
        return string.split(" ");
    }


    // 문자열 => 숫자 기능.
    double toInt(String string) {
        return Integer.parseInt(string);
    }

    // 3. 빈 문자열이면 예외처리한다.
    // 4. 빈 문자열이 아닐 때 계산을 실행한다.
    double doCalculations(String input) {
        if (isEmpty(input)) {
            throw new RuntimeException();
        }
        return doCalculationsSplitedString(splitInput(input));
    }


    // 계산 실행
    double doCalculationsSplitedString(String[] strings) {
        //int result = toInt(strings[0]);
        double result = toInt(strings[0]);
        for (int i = 0; i < strings.length-2; i+=2) {
            result = calculate(result, strings[i + 1], toInt(strings[i+2]));
        }
        return result;
    }


    // 계산
    double calculate(double first, String operation, double second) {
        if ("+".equals(operation)) {
            return Operation.PLUS.apply(first, second);
        }

        if ("-".equals(operation)) {
            return Operation.MINUS.apply(first, second);
        }

        if ("*".equals(operation)) {
            return Operation.TIMES.apply(first, second);
        }

        if ("/".equals(operation)) {
            return Operation.DIVIDEBY.apply(first, second);
        }
        throw new RuntimeException();
    }
}
