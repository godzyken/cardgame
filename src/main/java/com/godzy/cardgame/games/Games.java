package com.godzy.cardgame.games;

import com.godzy.cardgame.controller.GameController;
import com.godzy.cardgame.model.DeckFactory;
import com.godzy.cardgame.model.DeckFactory.DeckType;
import com.godzy.cardgame.view.GameSwingPassiveView;
import com.godzy.cardgame.view.GameSwingView;
import com.godzy.cardgame.view.GameViewables;

public abstract class Games {
    public static void main(String[] args) {

        GameViewables views = new GameViewables();

        GameSwingView gsv = new GameSwingView();
        gsv.createAndShowGUI();

        for (int i = 0; i < 3; i++) {
            GameSwingPassiveView passiveView = new GameSwingPassiveView();
            passiveView.createAndShowGUI();

            views.addViewable(passiveView);

            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        GameController gc = new GameController(DeckFactory.makeDeck(DeckType.Normal), views, new HighCardGameEvaluator());
        gc.run();
    }
}
