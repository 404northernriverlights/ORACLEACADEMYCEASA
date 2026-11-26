package Blackjack;

import java.util.Random;

public class Deck {
    Card[] cardArray = new Card[52];
    int topCard = 0; // Menandai posisi kartu teratas saat dibagikan

    Deck() { // constructor
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;
        for (int i = 1; i <= suits; i++) {
            for (int j = 1; j <= cardType; j++) {
                cardArray[cardCount] = new Card(i, j);
                cardCount++;
            }
        }
    }

    // Method shuffle (Poin a)
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < cardArray.length; i++) {
            int j = rand.nextInt(cardArray.length);
            // Tukar posisi kartu
            Card temp = cardArray[i];
            cardArray[i] = cardArray[j];
            cardArray[j] = temp;
        }
        topCard = 0; // Reset posisi kartu teratas setelah diacak
    }

    // Mengambil satu kartu dari deck
    public Card dealCard() {
        if (topCard < cardArray.length) {
            return cardArray[topCard++];
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < cardArray.length; i++) {
            System.out.println(cardArray[i]);
        }
    }
}