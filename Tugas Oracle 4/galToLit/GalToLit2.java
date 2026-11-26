package galToLit;

import java.util.Scanner;

public class GalToLit2 {
    public static void main(String[] args) {
        // Scanner untuk input dari keyboard
        Scanner in = new Scanner(System.in);

        // Menampilkan perintah untuk mengisi teks
        System.out.print("Masukkan Jumlah Galon: ");

        // Mendeklarasikan variabel gallons dan mengambil nilai dari ketikan pengguna
        double gallons = in.nextDouble();
        double liters = 0;

        //add your calculation here
        liters = gallons * 3.785;

        //output the result to user
        System.out.println(gallons+ " gallons equals " +liters+ " liters");

        //Menutup scanner
        in.close();
    }
}
