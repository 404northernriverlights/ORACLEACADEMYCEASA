import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kartu pertama (Soal 7)
        int suit1 = (int) (Math.random() * 4.0 + 1);
        int face1 = (int) (Math.random() * 13.0 + 1);
        Card card1 = new Card(suit1, face1);

        // Kartu kedua (Soal 7 - tambahan kartu acak kedua)
        int suit2 = (int) (Math.random() * 4.0 + 1);
        int face2 = (int) (Math.random() * 13.0 + 1);
        Card card2 = new Card(suit2, face2);

        System.out.println("Kartu 1: " + card1);
        System.out.println("Kartu 2: " + card2);

        // Soal 8a: Tampilkan total nilai poin untuk dua kartu acak tersebut
        int totalPoints = card1.points + card2.points;
        int cardCount = 2;
        System.out.println("Total Poin Saat Ini: " + totalPoints);

        // Soal 8b & 8c: Loop tambah kartu hingga poin > 21, pengguna menolak, atau total kartu = 5
        while (totalPoints <= 21 && cardCount < 5) {
            System.out.print("\nApakah Anda ingin kartu lagi? (y/n): ");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                int newSuit = (int) (Math.random() * 4.0 + 1);
                int newFace = (int) (Math.random() * 13.0 + 1);
                Card newCard = new Card(newSuit, newFace);

                cardCount++;
                totalPoints += newCard.points;

                System.out.println("Kartu ke-" + cardCount + ": " + newCard);
                System.out.println("Total Poin untuk semua " + cardCount + " kartu: " + totalPoints);
            } else {
                break; // Berhenti jika pengguna memilih tidak menambah kartu
            }
        }

        // Keterangan akhir kondisi berhenti
        if (totalPoints > 21) {
            System.out.println("\nPermainan selesai: Total poin melebihi 21!");
        } else if (cardCount == 5) {
            System.out.println("\nPermainan selesai: Total kartu sudah mencapai 5!");
        } else {
            System.out.println("\nPermainan selesai dengan total poin: " + totalPoints);
        }

        input.close();
    }
}