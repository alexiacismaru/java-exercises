package be.kdg.java1.assignments.a10_playing_cards;

import java.util.Random;
import java.util.Scanner;

public class PlayingCardsApp {
    public static void main(String[] args) {
        String[] suits = {
                "clubs", "diamonds", "spades", "hearts"
        };
        String[] ranks = {
                "ace", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "jack", "queen", "king"
        };

        Card[] cards = new Card[52];
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards[i * ranks.length + j] = new Card(suits[i], ranks[j]);
            }
        }

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        final int MAX_CARDS = 5;
        System.out.print("How many cards would you like? (1..5) ");
        int cardCount = scanner.nextInt();
        if (cardCount >= 1 && cardCount <= MAX_CARDS) {
            Card[] selectedCards = new Card[cardCount];
            for (int i = 0; i < selectedCards.length; i++) {
                Card randomCard;

                boolean cardWasTaken;
                do {
                    randomCard = cards[random.nextInt(cards.length)];

                    cardWasTaken = false;
                    for (Card selectedCard : selectedCards) {
                        if (selectedCard == randomCard) {
                            cardWasTaken = true;
                            break;
                        } else if (selectedCard == null) {
                            break;
                        }
                    }
                } while (cardWasTaken);

                selectedCards[i] = randomCard;
            }

            for (Card card : selectedCards) {
                System.out.printf("%s of %s%n", card.getRank(), card.getSuit());
            }
        } else {
            System.out.println("That's not a valid amount!");
        }
    }  // main()
}  // class
