package vehicles;

public class TestVehicle {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println(vehicle1.toString());

        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println(vehicle2.toString());

        // Mengubah static variable MAKE melalui vehicle2
        vehicle2.setMake("Seer");

        // Menampilkan nilai vehicle1 dan vehicle2 setelah MAKE diubah
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());

        // Soal 4d: Membuat object Engine bernama vehicle3 sebelum mencetak total jumlah mobil
        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");

        // Soal 4e: Menampilkan detail menggunakan method getter
        System.out.println("Vehicle number " + vehicle3.getChassisNo() +
                           " is a " + vehicle3.getModel() +
                           " model and has an engine capacity of " +
                           Vehicle.Engine.getCapacity() + "cc");

        // Soal 4f: Catatan perbedaan dengan vehicle1 / vehicle2
        // Jika mencoba memanggil method static milik Engine lewat objek Vehicle biasa,
        // misalnya vehicle1.getCapacity(), akan terjadi error karena getCapacity()
        // berada di dalam inner class Engine, bukan di class Vehicle.

        // Menampilkan total jumlah mobil yang diproduksi
        printTotalVehicles();
    }

    public static void printTotalVehicles() {
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }
}