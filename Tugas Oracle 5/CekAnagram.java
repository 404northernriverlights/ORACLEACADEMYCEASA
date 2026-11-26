import java.util.Arrays;
import java.util.Scanner;

public class CekAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PROGRAM PENGECEK ANAGRAM ===");
        System.out.print("Masukkan kata/frasa pertama: ");
        String str1 = scanner.nextLine();

        System.out.print("Masukkan kata/frasa kedua: ");
        String str2 = scanner.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("\nHasil: YA, keduanya adalah anagram!");
        } else {
            System.out.println("\nHasil: BUKAN anagram.");
        }

        scanner.close();
    }

    public static boolean isAnagram(String s1, String s2) {
        // 1. Ubah ke huruf kecil (lowercase) dan buang semua spasi serta tanda baca
        // Menggunakan regex [^a-zA-Z0-9] untuk menghapus selain huruf dan angka
        String bersih1 = s1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String bersih2 = s2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Jika panjang karakter setelah dibersihkan berbeda, sudah pasti bukan anagram
        if (bersih1.length() != bersih2.length()) {
            return false;
        }

        // 2. Ubah string menjadi array char, lalu urutkan (sort)
        char[] charArray1 = bersih1.toCharArray();
        char[] charArray2 = bersih2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // 3. Bandingkan apakah kedua array karakter persis sama
        return Arrays.equals(charArray1, charArray2);
    }
}