package vehicles;

public class Vehicle {
    // Static variables
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    // Instance variables
    private String chassisNo;
    private String model;

    // Constructor
    public Vehicle(String model) {
        numVehicles++;
        this.chassisNo = "ch" + numVehicles;
        this.model = model;
        System.out.println("Vehicle manufactured");
    }

    // Soal 4a - 4c: Inner static class Engine extends Vehicle dengan constructor super(model)
    public static class Engine extends Vehicle {
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        public Engine(String model) {
            super(model);
        }

        public static String getMake() {
            return MAKE;
        }

        public static int getCapacity() {
            return CAPACITY;
        }
    }

    // Getter dan Setter untuk MAKE
    public static String getMake() {
        return MAKE;
    }

    public static void setMake(String make) {
        MAKE = make;
    }

    // Getter dan Setter untuk chassisNo
    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    // Getter dan Setter untuk model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Method toString()
    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE + "\n" +
               "The model type is " + model + "\n" +
               "The chassis number is " + chassisNo + "\n" +
               "The engine make is " + Engine.getMake() + "\n" +
               "The engine capacity is " + Engine.getCapacity();
    }
}