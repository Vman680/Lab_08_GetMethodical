public class CtoFTableDisplay {
    public static void main(String[] args) {

        //Prints header
        System.out.printf("%-10s | %-10s\n", "Celsius", "Fahrenheit");

        for (int cel = -100; cel <= 100; cel++) {
            double fah = CtoF(cel);  // Call the method below
            System.out.printf("%-10d | %-10.1f\n", cel, fah);
        }
    }
    public  static double CtoF(double cel) {
        return cel * 9 / 5 + 32;
    }
}
