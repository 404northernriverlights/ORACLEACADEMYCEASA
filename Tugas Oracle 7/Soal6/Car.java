package Soal6;

public class Car extends Vehicle {
    private int numDoors;
    private boolean isElectric;

    public Car(int wheels, int numSeats, int numDoors, boolean isElectric) {
        super(wheels, numSeats);
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public boolean getIsElectric() {
        return isElectric;
    }
}