package com.godzy.cardgame.model;

public class Joker extends PlayingCard {

    public Joker(Rank rank, Suit suit) {
        super(extracted(rank), extracted2(suit));
        //TODO Auto-generated constructor stub
    }

    private static Suit extracted2(Suit suit) {
        return suit;
    }

    private static Rank extracted(Rank rank) {
        return rank;
    }
    
    public Rank getRank() {
        throw new UnsupportedOperationException();
    }

    public Suit getSuit() {
        throw new UnsupportedOperationException();
    }
}
