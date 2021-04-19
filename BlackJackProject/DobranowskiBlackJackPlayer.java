//Name - Patrick Dobranowski
//Date - 03/10/2021
//Black Jack Lab
//classes, for loops, if-else statements, switch cases

import java.util.*;

public class DobranowskiBlackJackPlayer {
    private List<Integer> hand;
    private int aceNum;
    private int money;
    private int bet;
    private int winsNum;

    // initialize player and hand represented by arraylist of cards
    public DobranowskiBlackJackPlayer() {
        hand = new ArrayList<Integer>();
        aceNum = 0;
        money = 100;
        bet = -1;
    }

    // add cards to hand arraylist
    public void addCard(int card) {
        hand.add(card);
        if (card == 0)
            aceNum++;
    }

    // remove all cards
    public void reset() {
        hand.clear();
        aceNum = 0;
        bet = -1;
    }

    // getter method
    public int getHandSize() {
        return hand.size();
    }

    // getter method
    public int getWinCount() {
        return winsNum;
    }

    public void addWin() {
        winsNum++;
    }

    // getter method
    public int getCard(int i) {
        return hand.get(i);
    }

    // getter method
    public int getMoney() {
        return money;
    }

    // getter method
    public int getBet() {
        return bet;
    }

    // getter method
    public void setBet(int bet) {
        this.bet = bet;
    }

    // getter method
    public void addMoney(int earn) {
        money += earn;
    }

    // Used for determining whether hard and soft totals are necessary
    public boolean hasAces() {
        return (aceNum > 0);
    }

    public int getPreTotal() {
        int total = 0;
        for (int i : hand) {
            // Jack, Queen, and King are all worth 10
            if (i > 10) {
                total += 10;
            } else {
                total += i;
            }
        }
        return total;
    }

    public char checkWin() {
        // 'B' represents bust and 'W' represents BlackJack
        if (getTotal() > 21) {
            return 'B';
        }
        if (getTotal() == 21 && getHandSize() < 3) {
            return 'W';
        }
        // return 'C' if neither a bust nor a blackjack took place
        return 'C';

    }

    // Hard total where aces count as 11
    public int getTotal() {
        int total = getPreTotal();
        for (int i : hand) {
            if (i == 0) {
                total += 11;
            }
        }
        return total;
    }

    // convert card value to to visible string
    public String toCard(int i) {
        switch (i) {
        case 0:
            return "A";
        case 2:
            return "2";
        case 3:
            return "3";
        case 4:
            return "4";
        case 5:
            return "5";
        case 6:
            return "6";
        case 7:
            return "7";
        case 8:
            return "8";
        case 9:
            return "9";
        case 10:
            return "10";
        case 11:
            return "J";
        case 12:
            return "Q";
        case 13:
            return "K";
        }
        // java gets angry at me if i don't add this :(
        return "";
    }

    public String toString() {
        String restr = "";
        for (int i : hand) {
            restr += toCard(i) + " ";
        }
        return restr;
    }
}
