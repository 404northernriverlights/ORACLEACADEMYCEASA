public class Fish {
    String typeOfFish;
    int friendliness;

    // Nomor 2: Constructor tanpa argumen
    public Fish() {
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    // Nomor 3: Constructor berparameter
    public Fish(String t, int f) {
        typeOfFish = t;
        friendliness = f;
    }

    // Nomor 5: Method mengembalikan tingkat keramahan
    public int getFriendliness() {
        return friendliness;
    }

    // Nomor 7: Method nicestFish menerima 2 objek Fish
    public static Fish nicestFish(Fish fish1, Fish fish2) {
        if (fish1.getFriendliness() >= fish2.getFriendliness()) {
            return fish1;
        } else {
            return fish2;
        }
    }

    // Nomor 8: Modifikasi nicestFish menggunakan varargs (variable arguments)
    public static Fish nicestFish(Fish... fishes) {
        Fish temp = fishes[0];
        for (Fish f : fishes) {
            if (f.getFriendliness() > temp.getFriendliness()) {
                temp = f;
            }
        }
        return temp;
    }
}