import java.sql.SQLOutput;
import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";  //sets string to 0 length, looped until input is valid
        do {
            System.out.print("\n" + prompt + ": ");     //outputs prompt
            retString = pipe.nextLine();                //reads input
        } while (retString.length() == 0);              //validates user input
        return retString;
    }
    public static int getInt(Scanner pipe, String prompt) {
        int integer;                                      //declare variables
        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {                    //validates input
                integer = pipe.nextInt();
                pipe.nextLine();
                break;
            }
            else {
                System.out.println("Invalid input. " + pipe.nextLine() + " is not a valid integer");
            }
        } while (true);
        return integer;
    }
    public static double getDouble(Scanner pipe, String prompt) {
        double doub;                                      //declare variables
        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {                    //validates input
                doub = pipe.nextDouble();
                pipe.nextLine();
                break;
            } else {
                System.out.println("Invalid input. " + pipe.nextLine() + " is not a valid integer");
            }
        } while (true);
        return doub;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int rangeInt = 0;                                      //declare variables
        do {
            System.out.println("\n" + prompt + " [" + low + " - " + high +"] : ");
            if (pipe.hasNextInt()) {                    //validates input
                rangeInt = pipe.nextInt();
                pipe.nextLine();
                if (rangeInt >= low && rangeInt <= high) {
                    break;
                }
                else {
                    System.out.println("Invalid input. Please enter number within the range.");
                }
            } else {
                System.out.println("Invalid input. " + pipe.nextLine() + " is not a number");
            }
        } while (true);
        return rangeInt;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double rangeDoub = 0;                                      //declare variables
        do {
            System.out.println("\n" + prompt + " [" + low + " - " + high +"] : ");
            if (pipe.hasNextDouble()) {                    //validates input
                rangeDoub = pipe.nextDouble();
                pipe.nextLine();
                if (rangeDoub >= low && rangeDoub <= high) {
                    break;
                }
                else {
                    System.out.println("Invalid input. Please enter number within the range.");
                }
            } else {
                System.out.println("Invalid input. " + pipe.nextLine() + " is not a number");
            }
        } while (true);
        return rangeDoub;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean ynConfirm;  //decalres variable
        String strYN;
        do {
            System.out.print("\n" + prompt + ": ");     //outputs prompt
            strYN = pipe.nextLine();
             if (strYN.equalsIgnoreCase("y")) {    //if input is Y then makes variable ture
                 ynConfirm = true;
                 break;
            }
             else if (strYN.equalsIgnoreCase("n")) {      //if input is N then variable is false
                ynConfirm = false;
                break;
            }
             else {
                 System.out.println("Invalid Input. Please only a Y or N.");    //invalid input error
             }

        } while (true);              //loops until input is valid
        return ynConfirm;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String inRegEx;                                 //declares varaible for input
        do {
            System.out.print("\n" + prompt + ": ");     //outputs prompt
                                         //declares variable to store input
            inRegEx = pipe.nextLine();                  //stores input

            if (inRegEx.matches(regEx)) {
                break;
            }
            else {
                System.out.println("Invalid input. Please try again");
            }
        } while (true);
        return inRegEx;
    }
    public static String prettyHeader(String msg) {
        //Example: PRO-Programmer = 14 - 54 = 40 / 2 = 20 = padding
        int padding = ((54 - msg.length()) / 2);

        for (int a = 0; a < 60; a++) {      //prints top row
            System.out.print("*");
        }
        System.out.println();               //next line
        for (int b = 0; b < 3; b++) {       //print left ***
            System.out.print("*");
        }
        for (int l = 0; l <= padding; l++) {  //prints left padding
            System.out.print(" ");
        }
        System.out.print(msg);                //print message
        for (int r = 0; r <= padding; r++) {  //prints right padding
            System.out.print(" ");
        }
        for (int c = 0; c < 3; c++) {       //prints right ***
            System.out.print("*");
        }
        System.out.println();               //print next line
        for (int d = 0; d < 60; d++) {      //prints btm row
            System.out.print("*");
        }
        return msg;
    }
}