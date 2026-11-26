import java.util.Scanner;

public class KalkulatorMatriks {

    // Method untuk menampilkan menu utama
    public static void tampilkanMenu() {
        System.out.println("\n================================");
        System.out.println("     KALKULATOR MATRIKS 2x2     ");
        System.out.println("================================");
        System.out.println("a. Masukkan Matriks A");
        System.out.println("b. Masukkan Matriks B");
        System.out.println("c. Tampilkan A + B");
        System.out.println("d. Tampilkan A - B");
        System.out.println("e. Tampilkan A * B");
        System.out.println("f. Keluar");
        System.out.print("Pilih opsi (a-f): ");
    }

    // Method untuk mengisi elemen matriks 2x2 dari input pengguna
    public static void inputMatriks(double[][] matriks, String namaMatriks, Scanner scanner) {
        System.out.println("\nMasukkan nilai untuk Matriks " + namaMatriks + " (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemen [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriks[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Matriks " + namaMatriks + " berhasil disimpan!");
    }

    // Method untuk mencetak bentuk matriks 2x2 agar mudah dibaca
    public static void cetakMatriks(double[][] matriks) {
        for (int i = 0; i < 2; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 2; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    // Method untuk menjumlahkan matriks A dan B
    public static double[][] tambahMatriks(double[][] a, double[][] b) {
        double[][] hasil = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = a[i][j] + b[i][j];
            }
        }
        return hasil;
    }

    // Method untuk mengurangkan matriks A dan B
    public static double[][] kurangMatriks(double[][] a, double[][] b) {
        double[][] hasil = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = a[i][j] - b[i][j];
            }
        }
        return hasil;
    }

    // Method untuk mengalikan matriks A dan B
    public static double[][] kaliMatriks(double[][] a, double[][] b) {
        double[][] hasil = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j]);
            }
        }
        return hasil;
    }

    // Main Method (Pusat Eksekusi Program)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriksA = new double[2][2];
        double[][] matriksB = new double[2][2];
        
        boolean adaA = false;
        boolean adaB = false;
        char pilihan;

        do {
            tampilkanMenu();
            pilihan = scanner.next().toLowerCase().charAt(0);

            switch (pilihan) {
                case 'a':
                    inputMatriks(matriksA, "A", scanner);
                    adaA = true;
                    break;

                case 'b':
                    inputMatriks(matriksB, "B", scanner);
                    adaB = true;
                    break;

                case 'c':
                    if (!adaA || !adaB) {
                        System.out.println("\n[PERINGATAN] Harap masukkan Matriks A dan Matriks B terlebih dahulu!");
                    } else {
                        System.out.println("\nHasil Penjumlahan (A + B):");
                        double[][] hasilTambah = tambahMatriks(matriksA, matriksB);
                        cetakMatriks(hasilTambah);
                    }
                    break;

                case 'd':
                    if (!adaA || !adaB) {
                        System.out.println("\n[PERINGATAN] Harap masukkan Matriks A dan Matriks B terlebih dahulu!");
                    } else {
                        System.out.println("\nHasil Pengurangan (A - B):");
                        double[][] hasilKurang = kurangMatriks(matriksA, matriksB);
                        cetakMatriks(hasilKurang);
                    }
                    break;

                case 'e':
                    if (!adaA || !adaB) {
                        System.out.println("\n[PERINGATAN] Harap masukkan Matriks A dan Matriks B terlebih dahulu!");
                    } else {
                        System.out.println("\nHasil Perkalian (A * B):");
                        double[][] hasilKali = kaliMatriks(matriksA, matriksB);
                        cetakMatriks(hasilKali);
                    }
                    break;

                case 'f':
                    System.out.println("\nTerima kasih telah menggunakan kalkulator matriks!");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid! Silakan masukkan huruf a sampai f.");
            }

        } while (pilihan != 'f');

        scanner.close();
    }
}