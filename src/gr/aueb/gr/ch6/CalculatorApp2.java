package gr.aueb.gr.ch6;
import java.io.IOException;
import java.util.Scanner;

public class CalculatorApp2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int choice;
        int errorCode;
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        while (true) {
            printMenu();
            choice = getChoice();
            errorCode = validate(choice);

            if (errorCode == 1) {
                System.out.println("Quiting ...");
                break;
            }

            if (errorCode == 2) {
                System.out.println("Error in choice");
                continue;
            }

            System.out.println("Please insert two integers");
            num1 = in.nextInt();
            num2 = in.nextInt();

            result = getResultFromChoice(choice, num1, num2);

            if (result == Integer.MIN_VALUE) {
                System.out.println("Divide by zero error");
                continue;
            }

            if (result == Integer.MAX_VALUE) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.println("Result: " + result);
        }
    }

    public static int getResultFromChoice(int choice, int num1, int num2) {
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                result = Integer.MAX_VALUE;
                break;
        }
        return result;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MIN_VALUE;    // error code
        }
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MIN_VALUE;    // error code
        }
        return num1 % num2;
    }

    public static int getChoice() throws IOException {
        return in.nextInt();
    }


    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Module");
        System.out.println("6. Έξοδος");
    }

    public static int validate(int choice) {
        int errorCode;

        switch (choice) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                errorCode = 0;
                break;
            case 6:
                errorCode = 1;
                break;
            default:
                errorCode = 2;
                break;
        }

        return errorCode;
    }
}