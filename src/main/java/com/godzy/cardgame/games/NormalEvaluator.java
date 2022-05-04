package com.godzy.cardgame.games;

import java.util.ArrayList;
import java.util.List;

import com.godzy.cardgame.model.IPlayer;

public class NormalEvaluator implements GameEvaluator {
    public NormalEvaluator() {
        games = new ArrayList<Games>();
    }

    @Override
    public IPlayer evaluateWinner(List<IPlayer> players) {
        // TODO Auto-generated method stub
        return new NormalEvaluator();
    }
}
