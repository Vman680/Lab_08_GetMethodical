import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        //brings in Scanner
        Scanner in = new Scanner(System.in);

        //declare variables
        int favNum;
        double favDoub;
        favNum = SafeInput.getInt(in, "Enter your favorite number");
        favDoub = SafeInput.getDouble(in, "Enter your favorite number with decimals");

        System.out.println("\nYour favorite number is: " + favNum);
        System.out.println("\nYour favorite decimal number is: " + favDoub);
    }
}
