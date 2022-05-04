package com.godzy.cardgame.games;

import com.godzy.cardgame.model.DeckFactory;
import com.godzy.cardgame.model.DeckFactory.DeckType;

public class SmallHighCardGameBuilder implements GameBuilder {
    public Game getGame() {
        return new Game(DeckFactory.makeDeck(DeckType.Small), EvaluatorFactory.makeEvaluator(EvaluationType.Hight));
    }
}