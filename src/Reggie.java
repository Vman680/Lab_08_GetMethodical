import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        //brings in Scanner
        Scanner in = new Scanner(System.in);
        String regExp;

        regExp = SafeInput.getRegExString(in, "Please enter your SSN. (###-##-####) ", "^\\d{3}[-]\\d{2}[-]\\d{4}$");
        regExp = SafeInput.getRegExString(in, "Please enter your UC student M number. ", "^(M|m)\\d{5}$");
        regExp = SafeInput.getRegExString(in, "What do you want to do with this document? (O/S/V/Q) ", "^[OoSsVvQq]$");

    }
}
