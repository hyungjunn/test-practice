package org.example;

import java.util.Scanner;

public class StringCalculator {
    //private Operation operator;
    // 1. 입력된 문자열 " "을 기준으로 문자들을 분리한다.
    public String[] splitStringToStringArr(String str) {
        return str.split(" ");
    }

    // 2. 나눈 문자열 중 숫자는 int형으로 바꿔준다.
    public int changeStringArrToInt(String str) {
        return Integer.parseInt(str);
    }

    // 3. 더하기
    double plus(double x, double y){
        return Operation.PLUS.apply(x, y);
    }

    // 4. 빼기
    double minus(double x, double y){
        return Operation.MINUS.apply(x, y);
    }
    // 5. 곱하기
    double times(double x, double y){
        return Operation.TIMES.apply(x, y);
    }
    // 6. 나누기
    double divide(double x, double y){
        return Operation.DIVIDEBY.apply(x, y);
    }
    // 7.
    //private calculate(){}
}

class Main {
    public static void main(String[] args) {
        //System.out.println(Operation.PLUS.apply(1, 2));
//        StringCalculator stringCalculator = new StringCalculator();
//        System.out.println(stringCalculator.plus(1,2));
        //System.out.println(Operation.PLUS);
    }
}

