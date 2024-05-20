package gr.aueb.gr.ch4;

import java.util.Scanner;

public class SwitchApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("Διάλεξε μια επιλογή από τις παρακάτω");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Επιλέξατε Εισαγωγή");
                    break;
                case 2:
                    System.out.println("Επιλέξατε Διαγραφή");
                    break;
                case 3:
                    System.out.println("Επιλέξατε Ενημέρωση");
                    break;
                case 4:
                    System.out.println("Επιλέξατε Αναζήτηση");
                    break;
                case 5:
                    System.out.println("Επιλέξατε Έξοδο");
                    break;
                default:
                    System.out.println("Λάθος αριθμός βάλε έναν αριθμό από το 1 έως 5");
                    break;
            }
        } while (choice !=5);
        System.out.println("Ευχαριστούμε");
    }
}
