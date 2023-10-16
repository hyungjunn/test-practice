package org.example.number_baseball;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class NumberBaseballGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean playAgain = false;
        while (!playAgain) {
            int[] computerNumbers = new int[3];



            for (int i = 0; i < 3; i++) {
                computerNumbers[i] = (int) (Math.random() * 9) + 1;
                for (int j = 0; j < i; j++) {
                    if (computerNumbers[i] == computerNumbers[j]) {
                        i--;
                    }
                }
            }
            boolean gameStart = true;
            while (gameStart) {

                int[] playerNumbers = new int[3];
                System.out.print("숫자를 입력해주세요: ");
                String playerNumber = scanner.nextLine();

                for (int i = 0; i < playerNumbers.length; i++) {
                    playerNumbers[i] = parseInt(playerNumber.substring(i, i + 1));
                }

                try {
                    for (int i = 0; i < playerNumbers.length; i++) {
                        if (playerNumbers[i] == 0 || playerNumber.length() != 3 ||
                                playerNumbers[0] == playerNumbers[1] ||
                                playerNumbers[1] == playerNumbers[2] ||
                                playerNumbers[0] == playerNumbers[2]) {
                            throw new RuntimeException();
                        }
                    }
                } catch (RuntimeException re) {
                    System.out.println("세 자리 수의 정수로 다시 입력해주세요.");
                    continue;
                }

                int numOfStrike = 0;
                int numOfBall = 0;
                int numOfFourball = 0;
                for (int i = 0; i < computerNumbers.length; i++) {
                    for (int j = 0; j < playerNumbers.length; j++) {
                        if (computerNumbers[i] == playerNumbers[j]) {
                            if (i == j) {
                                numOfStrike++;
                            } else {
                                numOfBall++;
                            }
                        } else {
                            numOfFourball++;
                        }
                    }
                }

                if (numOfStrike == 3) {
                    System.out.println(numOfStrike + "스트라이크");
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    gameStart = false;
                } else if (numOfFourball != 9) {
                    System.out.println(numOfBall + "볼 " + numOfStrike + "스트라이크");
                } else {
                    System.out.println("포볼");
                }
            }

            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String choice = scanner.nextLine();
            try {
                if (choice.equals("1") || choice.equals("2")) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException re) {
                if (!choice.equalsIgnoreCase("1")) {
                    playAgain = true;
                }
            }
        }
    }
}
