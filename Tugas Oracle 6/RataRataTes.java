import java.util.Scanner;

public class RataRataTes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Deklarasi array untuk menyimpan 5 nilai tes
        double[] nilaiTes = new double[5];
        double totalNilai = 0;
        
        System.out.println("=== PROGRAM HITUNG RATA-RATA TES ===");
        
        // Menerima input 5 nilai tes dari pengguna
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai tes ke-" + (i + 1) + " (0-100): ");
            nilaiTes[i] = scanner.nextDouble();
            totalNilai += nilaiTes[i]; // Menjumlahkan langsung nilai untuk rata-rata
        }
        
        // Menghitung rata-rata
        double rataRata = totalNilai / 5;
        
        // Menampilkan hasil
        System.out.println("\n----------------------------------------");
        System.out.println("Nilai rata-rata mahasiswa adalah: " + rataRata);
        System.out.println("----------------------------------------");
        
        scanner.close();
    }
}