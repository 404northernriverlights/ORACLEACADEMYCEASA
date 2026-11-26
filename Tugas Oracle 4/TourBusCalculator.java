import java.util.Scanner;

public class TourBusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // kapasitas bus
        final int KAPASITAS_BUS = 45;
        
        // Menerima input 
        System.out.print("Masukkan jumlah orang yang mendaftar: ");
        int totalOrang = input.nextInt();
        
        // Menghitung 
        int jumlahBus = totalOrang / KAPASITAS_BUS;
        
        // Menghitung sisa orang yang harus naik van 
        int orangNaikVan = totalOrang % KAPASITAS_BUS;
        
        // Mencetak hasil ke layar
        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus);
        System.out.println("Total jumlah orang yang harus naik van: " + orangNaikVan);
        
        input.close();
    }
}