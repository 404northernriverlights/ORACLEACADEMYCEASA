package Blackjack;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle(); // Mengacak deck

        System.out.println("=== SELAMAT DATANG DI PERMAINAN KARTU ALA BLACKJACK ===");

        // --- GILIRAN PEMAIN ---
        Hand playerHand = new Hand();
        
        // Mendistribusikan 2 kartu awal ke Player
        playerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());

        boolean ambilLagi = true;
        while (ambilLagi && playerHand.cardCount < 5 && playerHand.getTotalPoints() < 21) {
            System.out.println("\nKartu di tangan Anda:");
            playerHand.printHand();
            System.out.println("Total Poin Anda: " + playerHand.getTotalPoints());

            if (playerHand.getTotalPoints() == 21) {
                System.out.println("Luar biasa! Poin Anda 21!");
                break;
            }

            System.out.print("Apakah Anda ingin mengambil kartu lagi? (y/t): ");
            String pilihan = scanner.next();

            if (pilihan.equalsIgnoreCase("y")) {
                playerHand.addCard(deck.dealCard());
            } else {
                ambilLagi = false;
            }
        }

        System.out.println("\n--- HASIL AKHIR PEMAIN ---");
        System.out.println("Kartu akhir Anda:");
        playerHand.printHand();
        int finalPlayerPoints = playerHand.getTotalPoints();
        System.out.println("Total Poin Akhir: " + finalPlayerPoints);

        if (finalPlayerPoints > 21) {
            System.out.println("Anda BUST (Melebihi 21)! Dealer menang.");
            scanner.close();
            return;
        }

        // --- GILIRAN DEALER (Poin d) ---
        System.out.println("\n=== GILIRAN DEALER ===");
        Hand dealerHand = new Hand();
        dealerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());

        System.out.println("Kartu Dealer:");
        dealerHand.printHand();
        System.out.println("Total Poin Dealer: " + dealerHand.getTotalPoints());

        // Aturan Dealer: Jika poin < 16, dealer wajib ambil kartu terus sampai minimal 16 atau lebih
        while (dealerHand.getTotalPoints() < 16 && dealerHand.cardCount < 5) {
            System.out.println("Dealer mengambil kartu...");
            dealerHand.addCard(deck.dealCard());
            System.out.println("Total Poin Dealer sekarang: " + dealerHand.getTotalPoints());
        }

        int finalDealerPoints = dealerHand.getTotalPoints();
        System.out.println("\n--- KEPUTUSAN PEMENANG ---");
        System.out.println("Poin Anda   : " + finalPlayerPoints);
        System.out.println("Poin Dealer : " + finalDealerPoints);

        // Penentuan Pemenang
        if (finalDealerPoints > 21) {
            System.out.println("Dealer BUST (Melebihi 21)! Selamat, Anda MENANG!");
        } else if (finalPlayerPoints > finalDealerPoints) {
            System.out.println("Selamat, Anda MENANG mengalahkan Dealer!");
        } else if (finalPlayerPoints < finalDealerPoints) {
            System.out.println("Mohon maaf, Dealer MENANG.");
        } else {
            System.out.println("SERI (PUSH)!");
        }

        scanner.close();
    }
}