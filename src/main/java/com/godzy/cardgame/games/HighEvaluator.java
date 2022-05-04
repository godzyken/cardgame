package com.godzy.cardgame.games;

import java.util.List;

import com.godzy.cardgame.model.IPlayer;

public class HighEvaluator implements GameEvaluator {
    public HighEvaluator() {
      // TODO document why this constructor is empty

    }

    @Override
    public IPlayer evaluateWinner(List<IPlayer> players) {
        // TODO Auto-generated method stub
        return new HighEvaluator();
    }
}
