import java.util.Scanner;

public class PesanRahasia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Variabel untuk menyimpan hasil gabungan huruf dari pesan rahasia
        String pesanTerurai = "";
        
        System.out.println("=== PROGRAM PENGURAI PESAN RAHASIA ===");
        System.out.println("Masukkan 10 angka kode satu per satu.");
        System.out.println("Kode yang valid: 1 (D), 2 (W), 3 (E), 4 (L), 5 (H), 6 (O), 7 (R)\n");
        
        // Loop untuk meminta tepat 10 angka yang valid
        int jumlahMasukkan = 0;
        while (jumlahMasukkan < 10) {
            System.out.print("Masukkan angka ke-" + (jumlahMasukkan + 1) + ": ");
            int kode = input.nextInt();
            
            char huruf = ' ';
            boolean valid = true;
            
            // Menentukan huruf berdasarkan angka yang dimasukkan
            switch (kode) {
                case 1:
                    huruf = 'D';
                    break;
                case 2:
                    huruf = 'W';
                    break;
                case 3:
                    huruf = 'E';
                    break;
                case 4:
                    huruf = 'L';
                    break;
                case 5:
                    huruf = 'H';
                    break;
                case 6:
                    huruf = 'O';
                    break;
                case 7:
                    huruf = 'R';
                    break;
                default:
                    // Jika angka belum terpecahkan (di luar 1-7)
                    System.out.println("Peringatan: Angka " + kode + " belum terpecahkan! Silakan masukkan angka baru.");
                    valid = false;
            }
            
            // Jika angka valid, tambahkan ke pesan dan lanjut ke urutan berikutnya
            if (valid) {
                pesanTerurai += huruf;
                jumlahMasukkan++;
            }
        }
        
        // Menampilkan hasil akhir pesan rahasia yang telah diuraikan
        System.out.println("\n----------------------------------------");
        System.out.println("Pesan rahasia berhasil diuraikan!");
        System.out.println("Hasil Pesan: " + pesanTerurai);
        System.out.println("----------------------------------------");
        
        input.close();
    }
}