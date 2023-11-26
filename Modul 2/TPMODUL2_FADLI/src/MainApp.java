public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Data Mobil");
        Mobil Mobil = new Mobil("M1", 120.0, 5, 4);
        System.out.println(Mobil.toString());           

        System.out.println("\nData Bus");
        Bus Bus = new Bus("B1", 80.0, 40, 30);
        System.out.println(Bus.toString());
    }
}
