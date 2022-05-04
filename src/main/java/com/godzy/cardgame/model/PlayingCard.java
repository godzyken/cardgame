package com.godzy.cardgame.model;

interface PlayableCard {
    void flip();
}

public class PlayingCard implements PlayableCard{
    private final Rank rank;
    private final Suit suit;
    private boolean faceUp = false;

    public PlayingCard(Rank rank, Suit suit) {
        super();
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void flip() {
        faceUp = !faceUp;
        //return faceUp;
    }
}

class CoolCard {
    void turnOver() {
        
    }
}

class PlayingCardAdapter implements PlayableCard {

    CoolCard thisCard;

    @Override
    public void flip() {
        thisCard.turnOver();
    }
    
}