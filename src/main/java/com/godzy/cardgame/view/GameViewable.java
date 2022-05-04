package com.godzy.cardgame.view;

import com.godzy.cardgame.controller.GameController;

public interface GameViewable {
    public void setController(GameController gc);
    public void promptForPlayerName();
    public void promptForFlip();
    public void promptForNewGame();
    public void showWinner(String winner);
    public void showPlayerName(int playerIndex, String playerName);
    public void showFaceDownCardForPLayer(int i, String playerName);
    public void showCardForPlayer(int playerIndex, String playerName, String rank, String suit);
}
