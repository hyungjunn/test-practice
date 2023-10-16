package org.example.number_baseball.controller;

import org.example.number_baseball.model.Numbers;
import org.example.number_baseball.view.InputView;

public class BaseballGame {

    private final boolean playAgain = false;
    private final boolean gameStart = true;

    private Numbers numbers;

    private void getNewNumbers() {
        this.numbers = new Numbers();
    }

    public void setGameStart() {
        getNewNumbers();
        numbers.generateComputerNumbers();
        numbers.generatePlayerNumber(InputView.enterGameNumber());
    }
    
}
