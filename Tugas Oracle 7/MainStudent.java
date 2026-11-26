public class MainStudent {
    public static void main(String[] args) {
        // Soal 5: Membuat tiga instance dari class Student sesuai tabel
        Student student1 = new Student("Mary Jones", 14, 46);
        Student student2 = new Student("John Stiner", 60, 173);
        Student student3 = new Student("Ari Samala", 31, 69);

        // Soal 6: Menambahkan 13 kredit dan 52 poin mutu ke mahasiswa "Ari Samala"
        student3.updateAcademicRecord(13, 52);

        // Menampilkan hasil untuk verifikasi
        System.out.println("Nama: " + student3.getName());
        System.out.println("Total Kredit Baru: " + student3.getCredits());
        System.out.println("Total Poin Mutu Baru: " + student3.getQualityPoints());
        System.out.printf("IP (GPA) Terbaru: %.2f\n", student3.getGpa());
    }
}