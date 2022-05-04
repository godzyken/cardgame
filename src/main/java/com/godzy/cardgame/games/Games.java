package com.godzy.cardgame.games;

import com.godzy.cardgame.controller.GameController;
import com.godzy.cardgame.model.Deck;
import com.godzy.cardgame.view.GameSwingView;

public class Games {
    public static void main(String[] args) {
        GameSwingView gsv = new GameSwingView();
        gsv.createAndShowGUI();

        GameController gc = new GameController(new Deck(), gsv, new HighCardGameEvaluator());
        gc.run();
    }
}
