public class MainAnimal {
    public static void main(String[] args) {
        // Instance #1 menggunakan constructor tanpa parameter (speed default = 2.0)
        Animal animal1 = new Animal();

        // Instance #2 menggunakan constructor berparameter (misalnya w=10, h=2, s=15)
        Animal animal2 = new Animal(10, 2, 15);

        // Mencetak kecepatan menggunakan method getSpeed()
        System.out.println("Animal #1 memiliki kecepatan " + animal1.getSpeed());
        System.out.println("Animal #2 memiliki kecepatan " + animal2.getSpeed());
    }
}