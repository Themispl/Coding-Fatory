package gr.aueb.gr.ch1;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;
        int max = 0;
        boolean areEqual = false;

        System.out.println("Please insert two numbers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        if (num1 > num2){
            //min = num2;
            min= (num1 < num2) ? num1 : num2;
            max = num1;
        }else if(num1 < num2){
            min = num1;
            max = num2;
        }else {
            System.out.println("equal");
            areEqual = true;
        }
        if (!areEqual){
            System.out.println("Min: " + min);
            System.out.println("Max: " +max);
        }
    }
}
