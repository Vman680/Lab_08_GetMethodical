import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//declare variables
        double itemPrice;
        double ttlPrice = 0;
        boolean checkout = false;

//process 1 - looped ask user to input price of item
        do {
            itemPrice = SafeInput.getRangedDouble(in,"Enter the price of your item :",
                    .5, 10);
            ttlPrice += itemPrice;        //adds price of item to total cart

//process 2 - asks the user if they are done shopping
            checkout = SafeInput.getYNConfirm(in, "Are you finished shopping? ");
            System.out.println("Current totel: $" + ttlPrice);
        } while (!checkout);

    }
}
