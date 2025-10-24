import java.sql.SQLOutput;
import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        //brings in Scanner
        Scanner in = new Scanner(System.in);

//declare variables
        int year;
        int month;
        int day = 0;
        int hour;
        int min;

//process 1 - gets year and month input
        year = SafeInput.getRangedInt(in, "Enter your birth year: ",1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter your birth month: ", 1, 12);

//process 2 - gets day depending on month
        switch (month) {
            case 2 -> {
                day = SafeInput.getRangedInt(in, "Enter your birth day: ", 1, 29);
            }
            case 4, 6, 9, 11 -> {
                day = SafeInput.getRangedInt(in, "Enter your birth day: ", 1, 30);
            }
            case 1, 3, 5, 7, 8, 10, 12 -> {
                day = SafeInput.getRangedInt(in, "Enter your birth day: ", 1, 31);
            }
        }

//process 3 - gets time
        hour = SafeInput.getRangedInt(in, "Enter your birth hour (24 hour format): ", 0, 23);
        min = SafeInput.getRangedInt(in, "Enter your birth minute: ", 0, 59);

//process 4 - outputs date and time and formats it
        System.out.println("Date of Birth: " + hour + ":" + min + " "
                + day + "/" + month + "/" + year);
    }
}