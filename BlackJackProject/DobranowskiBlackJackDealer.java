//Name - Patrick Dobranowski
//Date - 03/10/2021
//Black Jack Lab
//classes, for loops, and arraylists

import java.util.*;

//the dealer is just a player with a little bit of added functionality such as a logic controller
public class DobranowskiBlackJackDealer extends DobranowskiBlackJackPlayer {
    private List<Integer> deck = new ArrayList<Integer>();

    public DobranowskiBlackJackDealer() {
        // 4 suits and 12 card types
        for (int i = 0; i < 4; i++) {
            deck.add(0);
            for (int j = 2; j < 14; j++) {
                deck.add(j);
            }
        }
    }

    // choose a random card
    public int drawCard() {
        double rand = Math.random();
        rand = rand * deck.size();
        return (deck.remove((int) rand));
    }

    public String getDeck() {
        String reStr = "";
        for (int i : deck) {
            reStr += i + " ";
        }
        return reStr;
    }

    // dealer logic
    public void play() {
        boolean dealerTurn = true;
        while (dealerTurn) {
            // the dealer will hit until 17
            if (getTotal() < 17) {
                addCard(drawCard());
            }
            // hit if the total is 17 and the dealer has an ace
            if (getTotal() == 17 && hasAces()) {
                addCard(drawCard());
            }
            // if he gets above 17 he stops
            if (getTotal() > 17) {
                dealerTurn = false;
            }
        }
    }

    // check for Dealer Win
    public boolean dealerWin(DobranowskiBlackJackPlayer other) {
        return (this.getTotal() > other.getTotal());
    }

    // hide the dealer's first card
    public String faceDown() {
        return "# " + toCard(getCard(1));
    }

    // reshuffle deck to prevent card counting
    public void shuffle() {
        deck.clear();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                deck.add(j);
            }
        }
    }

}
