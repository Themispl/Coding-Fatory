package gr.aueb.gr.ch1;
import java.util.Scanner;

/**
 * μετατρέπει ακέραιες θερμοκρασίες Φαρενάιτ
 * στην κλίμακα Κελσίου
 */
public class cont {
    public static void main(String[] args) {
        //set values
        int farenait = 0;
        int celc = 0;
        //Commands
        Scanner in = new Scanner(System.in);
        System.out.println("Εισάγετε θερμοκρασία");
        farenait = in.nextInt();
        celc = (5 * (farenait - 32)) / 9 ;
        System.out.printf("θερμοκρασία Φαρενάιτ : %,d , θερμοκρασία Κελσίου : %,d ",farenait ,celc);

    }
}
