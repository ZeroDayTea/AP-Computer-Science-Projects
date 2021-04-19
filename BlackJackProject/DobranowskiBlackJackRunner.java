//Name - Patrick Dobranowski
//Date - 03/10/2021
//Black Jack Lab
//do-while loops, switch cases, if-else statements, classes, and standard input/output

import java.util.*;

public class DobranowskiBlackJackRunner {
    public static void main(String args[]) {
        Scanner keyboardIN = new Scanner(System.in);
        boolean play = true;
        System.out.println("Dobranowski Casino BlackJack" + "\n\n" + "Rules:" + "\n" + "1. Dealer hits on soft 17"
                + "\n" + "2. Blackjack is 21" + "\n" + "3. Blackjack pays 2 to 1" + "\n" + "4. You start with $100"
                + "\n" + "5. # is the overturned card of the dealer that is not visible to you" + "\n");
        DobranowskiBlackJackPlayer player = new DobranowskiBlackJackPlayer();
        DobranowskiBlackJackDealer dealer = new DobranowskiBlackJackDealer();

        while (play) {
            System.out.println("Place your bet. You currently have $" + player.getMoney());
            {
                while (player.getBet() < 0) {
                    int temp = keyboardIN.nextInt();
                    if (temp > player.getMoney() || temp < 0) {
                        System.out.println("You don't have that much money :( you only have: " + player.getMoney());
                    } else {
                        player.setBet(temp);
                        player.addMoney(-player.getBet());
                    }
                }
            }

            // add player hands
            player.addCard(dealer.drawCard());
            player.addCard(dealer.drawCard());

            // add dealer hands
            dealer.addCard(dealer.drawCard());
            dealer.addCard(dealer.drawCard());

            printHands(player, dealer);

            // after drawing hands give player choice
            boolean playing = true;
            do {
                boolean playerChoice = true;
                String choiceString;
                do {
                    System.out.println("Type 'Hit' to hit, 'Stand' to stand and 'DD' to Double Down.");
                    choiceString = keyboardIN.next();
                    playerChoice = false;
                    switch (choiceString) {
                    case "Hit":
                        // add one card
                        player.addCard(dealer.drawCard());
                        printHands(player, dealer);
                        if (player.checkWin() != 'B') {
                            playerChoice = true;
                        }
                        break;

                    case "Stand":
                        // don't add any cards
                        break;

                    case "DD":
                        // double original bet and add a card
                        if (player.getMoney() < player.getBet()) {
                            System.out.println("You don't have that much money :(");
                        } else {
                            player.addMoney((-player.getBet()));
                            player.setBet(player.getBet() * 2);
                            player.addCard(dealer.drawCard());
                        }
                        break;
                    default:
                        System.out.println("That is not an option");
                        playerChoice = true;
                        break;
                    }

                } while (playerChoice);

                printHands(player, dealer);
                switch (player.checkWin()) {
                // add three times the original bet
                case 'J':
                    System.out.println("You have a blackjack! You win 2x your original bet");
                    playing = false;
                    player.addMoney(player.getBet() * 3);
                    player.addWin();
                    break;

                case 'B':
                    System.out.println("You Busted!");
                    dealer.addWin();
                    playing = false;
                    break;
                }

                // Dealer Turn
                if (playing) {
                    dealer.play();
                    System.out.println("Dealer is playing...");
                    checkHands(player, dealer);
                    if (dealer.checkWin() == 'B') {
                        System.out.println("Dealer Busts! You win!");
                        // return player money and add winnings
                        player.addMoney(player.getBet() * 2);
                        player.addWin();
                    } else if (dealer.getTotal() == player.getTotal()) {
                        System.out.println("Tie! You win and lose.... Nothing!");
                        // return player money
                        player.addMoney(player.getBet());
                    } else if (dealer.dealerWin(player)) {
                        System.out.println("Dealer Wins! You lose!");
                        dealer.addWin();
                    } else {
                        System.out.println("You Win! You get your original bet back!");
                        // return player money and add winnings
                        player.addMoney(player.getBet() * 2);
                        player.addWin();
                    }
                    playing = false;
                }
            } while (playing);

            System.out.println("Round is over. You have " + player.getWinCount() + " won rounds. Dealer has "
                    + dealer.getWinCount() + " won rounds. In total you have $" + player.getMoney()
                    + ". Another one? ('Yes' or 'No')");
            // Exit if bankrupt
            if (player.getMoney() <= 0) {
                System.out.println("You are out of money! Goodbye!");
                System.exit(1);
            }

            boolean choose = true;
            String tempVar;
            do {
                tempVar = keyboardIN.next();
                choose = false;
                switch (tempVar) {
                case "Yes":
                    play = true;
                    // reset player and dealer hands
                    player.reset();
                    dealer.reset();
                    break;
                case "No":
                    System.out.println("Exiting now...");
                    System.exit(1);
                    break;
                }
            } while (choose);

        }
    }

    // Show hands but dealer has one card hidden
    public static void printHands(DobranowskiBlackJackPlayer pl, DobranowskiBlackJackDealer dealer) {
        System.out.print("Player Hand: ");
        System.out.println(pl);
        System.out.print("Dealer Hand: ");
        System.out.println(dealer.faceDown());
        System.out.println("Player Total: " + pl.getTotal());
        System.out.println();
    }

    public static void checkHands(DobranowskiBlackJackPlayer pl, DobranowskiBlackJackDealer dealer) {
        System.out.print("Player Hand: ");
        System.out.println(pl);
        System.out.print("Dealer Hand: ");
        System.out.println(dealer);
        System.out.println("Player Total: " + pl.getTotal());
        System.out.println("Dealer Total: " + dealer.getTotal());
        System.out.println();
    }
}
