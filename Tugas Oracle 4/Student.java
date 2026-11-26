public class Student {
    
    String fName;
    String lName;
    int stuId;
    boolean stuStatus;

    public static void main(String[] args) {
        
        Student lisa = new Student();

    
        lisa.fName = "Lisa";
        lisa.lName = "Palombo";
        lisa.stuId = 123456789;
        lisa.stuStatus = true; 

        
        System.out.println("Student Name: " + lisa.fName + " " + lisa.lName);
        System.out.println("Student ID: " + lisa.stuId);
        System.out.println("Student Status: Active");
    }
}