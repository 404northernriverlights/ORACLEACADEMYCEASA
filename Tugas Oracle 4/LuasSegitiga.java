import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Menerima input alas (b) dan tinggi (h)
        System.out.print("Masukkan panjang alas (b): ");
        double b = input.nextDouble();
        
        System.out.print("Masukkan tinggi segitiga (h): ");
        double h = input.nextDouble();
        
        // Menghitung luas segitiga
        double a = 0.5 * b * h;
        
        
        System.out.println("Luas Segitiga (A) adalah: " + a);
        
        input.close();
    }
}
