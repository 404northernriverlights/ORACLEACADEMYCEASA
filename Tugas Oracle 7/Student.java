public class Student {
    // Instance variables
    private String name;
    private int credits;
    private double gpa;
    private double qualityPoints;

    // Constructor
    public Student(String name, int credits, double qualityPoints) {
        this.name = name;
        this.credits = credits;
        this.qualityPoints = qualityPoints;
        this.gpa = calculateGPA();
    }

    // a. Method untuk mengembalikan nilai rata-rata indeks prestasi (IP/GPA) saat ini
    public double calculateGPA() {
        if (credits == 0) {
            return 0.0; // Mencegah error pembagian dengan nol
        }
        return qualityPoints / credits;
    }

    // b. Method untuk menambah kredit & poin mutu baru, lalu memperbarui IP
    public void updateAcademicRecord(int newCredits, double newQualityPoints) {
        this.credits += newCredits;
        this.qualityPoints += newQualityPoints;
        this.gpa = calculateGPA();
    }

    // Method tambahan (opsional) untuk menampilkan data mahasiswa
    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public double getGpa() {
        return gpa;
    }

    public double getQualityPoints() {
        return qualityPoints;
    }
}