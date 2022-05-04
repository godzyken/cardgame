package com.godzy.cardgame.games;

import java.util.List;

import com.godzy.cardgame.model.Player;

public interface GameEvaluator {
    public Player evaluateWinner(List<Player> players);
    
}
