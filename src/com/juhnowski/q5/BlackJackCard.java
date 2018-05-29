package com.juhnowski.q5;

public class BlackJackCard extends Card{
    public BlackJackCard(int card, Suit suit) { super(card, suit); }

    public int value(){
        int r = super.value();
        if (r == 1) {
            return 11;
        }

        if (r < 10) {
            return r;
        }

        return 10;
    }

    boolean isAce() {
        return super.value() == 1;
    }
}
