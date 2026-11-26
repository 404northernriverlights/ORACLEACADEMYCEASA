package Blackjack;

public class Hand {
    Card[] handCards = new Card[5];
    int cardCount = 0;

    // Menambahkan kartu ke tangan
    public void addCard(Card c) {
        if (cardCount < 5) {
            handCards[cardCount] = c;
            cardCount++;
        }
    }

    // Menghitung total poin dengan aturan Ace menjadi 1 jika total > 21 (Poin c)
    public int getTotalPoints() {
        int total = 0;
        int aceCount = 0;

        for (int i = 0; i < cardCount; i++) {
            total += handCards[i].getPointValue();
            if (handCards[i].name.equals("Ace")) {
                aceCount++;
            }
        }

        // Jika total > 21 dan ada Ace yang bernilai 11, ubah nilainya jadi 1 (kurangi 10)
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    public void printHand() {
        for (int i = 0; i < cardCount; i++) {
            System.out.println("- " + handCards[i]);
        }
    }
}