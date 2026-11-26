package Soal6;

public class Convertible extends Car {
    // Soft top or ragtop, or hardtop
    private String roofType;

    public Convertible(int wheels, int numSeats, int numDoors, boolean isElectric, String roofType) {
        super(wheels, numSeats, numDoors, isElectric);
        this.roofType = roofType;
    }

    public String getRoofType() {
        return roofType;
    }
}