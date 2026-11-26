import java.util.Scanner;

public class SeleksiUniversitas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input data dari pengguna
        System.out.print("Apakah siswa adalah valedictorian atau salutatorian? (ya/tidak): ");
        String statusSiswa = input.next().toLowerCase();

        System.out.print("Masukkan jumlah siswa di sekolah (ukuran sekolah): ");
        int jumlahSiswaSekolah = input.nextInt();

        System.out.print("Masukkan nilai GPA siswa (contoh: 3.7): ");
        double gpa = input.nextDouble();

        System.out.print("Masukkan skor SAT siswa (contoh: 1200): ");
        int sat = input.nextInt();

        // Variabel untuk menyimpan status diterima atau ditolak
        boolean diterima = false;

        // Kriteria 1: Valedictorian atau Salutatorian dari sekolah dengan siswa >= 1400
        if ((statusSiswa.equals("valedictorian") || statusSiswa.equals("salutatorian") || statusSiswa.equals("ya")) 
            && jumlahSiswaSekolah >= 1400) {
            diterima = true;
        }
        // Kriteria 2: GPA >= 4.0 dan SAT >= 1100
        else if (gpa >= 4.0 && sat >= 1100) {
            diterima = true;
        }
        // Kriteria 3: GPA >= 3.5 dan SAT >= 1300
        else if (gpa >= 3.5 && sat >= 1300) {
            diterima = true;
        }
        // Kriteria 4: GPA >= 3.0 dan SAT >= 1500
        else if (gpa >= 3.0 && sat >= 1500) {
            diterima = true;
        }

        // Menampilkan hasil keputusan
        System.out.println("\n----------------------------------------");
        if (diterima) {
            System.out.println("Selamat! Mahasiswa **DITERIMA** di Mountville University.");
        } else {
            System.out.println("Mohon maaf, mahasiswa **TIDAK DITERIMA** di Mountville University.");
        }
        System.out.println("----------------------------------------");

        input.close();
    }
}