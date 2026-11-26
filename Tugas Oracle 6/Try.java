public class Try {
    public static void main(String[] args) {
        String teks = null;
        try {
            // Baris ini akan memicu NullPointerException
            teks.length(); 
        } catch (NullPointerException e) {
            System.out.println("Terjadi kesalahan: Objek bernilai null!");
        }
    }
}