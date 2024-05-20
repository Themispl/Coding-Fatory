package gr.aueb.gr.ch1;
import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {

        System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:\n");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
        Scanner inp = new Scanner(System.in);
        System.out.println("Δώστε αριθμό επιλογής: ");
        String in = inp.nextLine();
    }
}
