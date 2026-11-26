import java.util.Scanner;

public class HitungCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dimensi ruangan (dalam satuan kaki / feet)
        System.out.print("Masukkan panjang ruangan (kaki): ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar ruangan (kaki): ");
        double lebar = scanner.nextDouble();

        System.out.print("Masukkan tinggi ruangan (kaki): ");
        double tinggi = scanner.nextDouble();

        // 1. Hitung total luas permukaan yang dicat (kaki persegi / sq ft)
        double luasDinding = 2 * (panjang * tinggi) + 2 * (lebar * tinggi);
        double luasLangitLangit = panjang * lebar;
        double totalLuas = luasDinding + luasLangitLangit;

        System.out.println("\nTotal luas permukaan yang harus dicat: " + totalLuas + " kaki persegi.");

        // 2. Mencari kombinasi optimal ember 5 liter dan 1 liter
        int optimalEmber5 = 0;
        int optimalEmber1 = 0;
        double hargaMinimum = Double.MAX_VALUE;

        // Simulasi kombinasi jumlah ember 5 liter (maksimal berdasarkan kebutuhan luas)
        int maxEmber5 = (int) Math.ceil(totalLuas / 1500) + 1;
        int maxEmber1 = (int) Math.ceil(totalLuas / 300) + 1;

        for (int e5 = 0; e5 <= maxEmber5; e5++) {
            for (int e1 = 0; e1 <= maxEmber1; e1++) {
                // Hitung total area yang bisa ditutup oleh kombinasi ini
                double totalCover = (e5 * 1500) + (e1 * 300);

                if (totalCover >= totalLuas) {
                    double totalHarga = (e5 * 15.0) + (e1 * 4.0);

                    // Cari harga yang paling murah
                    if (totalHarga < hargaMinimum) {
                        hargaMinimum = totalHarga;
                        optimalEmber5 = e5;
                        optimalEmber1 = e1;
                    }
                }
            }
        }

        // 3. Menampilkan hasil perhitungan optimal
        System.out.println("\n=== REKOMENDASI PEMBELIAN CAT OPTIMAL ===");
        System.out.println("Ember 5 liter : " + optimalEmber5 + " buah (Rp/USD 15 masing-masing)");
        System.out.println("Ember 1 liter : " + optimalEmber1 + " buah (Rp/USD 4 masing-masing)");
        System.out.println("Total Biaya   : $" + hargaMinimum);

        scanner.close();
    }
}