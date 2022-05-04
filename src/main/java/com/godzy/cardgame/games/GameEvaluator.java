package com.godzy.cardgame.games;

import java.util.List;

import com.godzy.cardgame.model.IPlayer;

public interface GameEvaluator {
    public IPlayer evaluateWinner(List<IPlayer> players);
    
}
