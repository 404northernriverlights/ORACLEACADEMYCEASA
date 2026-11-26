public class MainFish {
    public static void main(String[] args) {
        // Nomor 6: Inisialisasi dua ikan baru
        Fish amber = new Fish("AngelFish", 5); // Nama: Amber, Jenis: AngelFish, Keramahan: 5
        Fish james = new Fish("Guppy", 3);     // Nama: James, Jenis: Guppy, Keramahan: 3

        // Nomor 7 & 9: Uji method nicestFish
        Fish palingRamah = Fish.nicestFish(amber, james);

        // Menampilkan hasil (yang dikembalikan adalah ikan dengan keramahan tertinggi, yaitu Amber)
        if (palingRamah == amber) {
            System.out.println("Ikan yang dikembalikan adalah: Amber (" + palingRamah.typeOfFish + ") dengan tingkat keramahan " + palingRamah.getFriendliness());
        } else {
            System.out.println("Ikan yang dikembalikan adalah: James (" + palingRamah.typeOfFish + ") dengan tingkat keramahan " + palingRamah.getFriendliness());
        }
    }
}