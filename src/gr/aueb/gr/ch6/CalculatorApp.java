package gr.aueb.gr.ch6;

import java.io.IOException;
import java.util.Scanner;

public class CalculatorApp {
    static Scanner in = new Scanner(System.in);
    static boolean iserror = false;

    public static void main(String[] args) throws IOException {
      playtheGame();
    }
    public static void  playtheGame() throws IOException{
        int result= 0;
        char choise = ' ';
        while (true) {
            printMenu();
            choise = getChoise();
            if (choise == 'q' || choise == 'Q') break;
            result = getResult(choise);
            if (iserror) continue;
            printResult(result);
        }
    }
    public static void  printResult(int result){
        System.out.println("result" + result);
    }
    public static void printMenu(){
        System.out.println("Epilexte ena apo ta parakato");
        System.out.println("1. Prosthesh");
        System.out.println("2. afairesh");
        System.out.println("3. pollaplasiasmos");
        System.out.println("4. diairesi");
        System.out.println("5. Module");
        System.out.println("Q/q. exodos");
    }
    public static char getChoise() throws IOException {
        return (char) System.in.read();
    }
    public  static  int getResult(char choice){
        if (choice <'1' || choice>'5' ){
            System.out.println("error. try again");
            iserror = true;
            return 0;
        }
        int num1 = 0;
        int num2 = 0;
        num1 = getOneint();
        num2 = getOneint();
        switch (choice){
            case '1':
                return add(num1, num2);
            case '2':
                return sub(num1, num2);
            case '3':
              return mul(num1, num2);
            case '4':
                return div(num1, num2);
            case '5':
                return mod(num1, num2);
            default:
                System.out.println("error");
                iserror = true;
                return 0;
        }
    }
    public static int getOneint(){
        System.out.println("dwse ena ariumo");
        return in.nextInt();
    }

    public  static  int add(int num1, int num2){
        return  num1 + num2;
    }
    public  static  int sub(int num1, int num2){
        return  num1 - num2;
    }
    public  static  int mul(int num1, int num2){
        return  num1 * num2;
    }
    public  static  int div(int num1, int num2){
        if (num2 == 0){
            System.out.println("error dived by zero");
            iserror = true;
            return 0;
        }
        return num1/num2;
    }
    public  static  int mod(int num1, int num2) {
        if (num2 == 0){System.out.println("error dived by zero");
            iserror = true;
            return 0;
        }
        return num1 % num2;
    }
}
