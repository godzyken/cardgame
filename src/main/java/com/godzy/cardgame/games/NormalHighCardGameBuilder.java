package com.godzy.cardgame.games;

import com.godzy.cardgame.model.DeckFactory;
import com.godzy.cardgame.model.DeckFactory.DeckType;

public class NormalHighCardGameBuilder implements GameBuilder {
    public Games getGame() {
        return new Games(DeckFactory.makeDeck(DeckType.Normal), EvaluatorFactory.makeEvaluator(EvaluationType.High));
    }
}