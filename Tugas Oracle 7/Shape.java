public class Shape {
    private int numSides;
    private boolean regular;

    // Constructor 1: Default (tanpa parameter)
    public Shape() {
        this.numSides = 3;      
        this.regular = false;
    }

    // Constructor 2: Berparameter
    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    // Getter dan Setter untuk numSides
    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    // Getter dan Setter untuk regular
    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }
}