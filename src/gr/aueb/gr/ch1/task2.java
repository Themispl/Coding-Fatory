package gr.aueb.gr.ch1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int num1=0;
        int num2=0;
        int num3=0;

        Scanner in = new Scanner(System.in);
        System.out.println("Εισάγετε Ημέρα");
        num1 = in.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.println("Εισάγετε Μήνα");
        num2 = in2.nextInt();
        Scanner in3 = new Scanner(System.in);
        System.out.println("Εισάγετε Χρονιά");
        num3 = in3.nextInt();
        System.out.printf(" %,d/%,d/%d ",num1 , num2, num3);
    }
}
