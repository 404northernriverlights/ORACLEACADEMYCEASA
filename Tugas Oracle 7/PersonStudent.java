// File: PersonStudent.java
import java.util.Date;

public class PersonStudent extends Person {
    private String studentId;
    private double gpa;
    private String major;
    private String degree;
    private int expectedGradYear;

    public PersonStudent(String firstName, String middleName, String lastName, Date dateOfBirth,
                         String studentId, String major, String degree, int expectedGradYear) {
        super(firstName, middleName, lastName, dateOfBirth);
        this.studentId = studentId;
        this.major = major;
        this.degree = degree;
        this.expectedGradYear = expectedGradYear;
        this.gpa = 0.0;
    }

    public String getStudentId() { return studentId; }
    public double getGpa() { return gpa; }
    public String getMajor() { return major; }
    public String getDegree() { return degree; }
    public int getExpectedGradYear() { return expectedGradYear; }

    // Method untuk administrator mengubah jurusan mahasiswa
    public void setMajor(String major) {
        this.major = major;
    }

    // Method untuk menghitung IP dari array nilai
    public void calculateGPA(String[] grades) {
        if (grades == null || grades.length == 0) {
            this.gpa = 0.0;
            return;
        }
        double totalPoints = 0.0;
        for (String grade : grades) {
            switch (grade) {
                case "A":  totalPoints += 4.0; break;
                case "A-": totalPoints += 3.67; break;
                case "B+": totalPoints += 3.33; break;
                case "B":  totalPoints += 3.0; break;
                case "B-": totalPoints += 2.67; break;
                case "C+": totalPoints += 2.33; break;
                case "C":  totalPoints += 2.0; break;
                case "D":  totalPoints += 1.0; break;
                case "F":  totalPoints += 0.0; break;
            }
        }
        this.gpa = totalPoints / grades.length;
    }
}