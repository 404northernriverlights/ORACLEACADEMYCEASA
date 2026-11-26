package Soal6;

public class Bicycle extends Vehicle {
    // Mountain bike, road bike, recreational bike, etc.
    private String bikeType;

    public Bicycle(int wheels, int numSeats, String bikeType) {
        super(wheels, numSeats);
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }
}