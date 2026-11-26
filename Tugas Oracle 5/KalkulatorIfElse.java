import java.util.Scanner;

public class KalkulatorIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double num1 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan bilangan kedua: ");
        double num2 = scanner.nextDouble();

        double hasil = 0;
        boolean valid = true;

        if (operator == '+') {
            hasil = num1 + num2;
        } else if (operator == '-') {
            hasil = num1 - num2;
        } else if (operator == '*') {
            hasil = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                hasil = num1 / num2;
            } else {
                System.out.println("Error: Tidak bisa membagi dengan nol!");
                valid = false;
            }
        } else if (operator == '%') {
            if (num2 != 0) {
                hasil = num1 % num2;
            } else {
                System.out.println("Error: Modulus dengan nol tidak diperbolehkan!");
                valid = false;
            }
        } else {
            System.out.println("Error: Operator tidak valid!");
            valid = false;
        }

        if (valid) {
            System.out.println("Hasil: " + num1 + " " + operator + " " + num2 + " = " + hasil);
        }

        scanner.close();
    }
}