package gr.aueb.gr.ch1;

import java.util.Scanner;

public class FactorilaApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int facto = 0;
        int n = 0;
        int i = 0;

        System.out.println("vale to n");
        n = in.nextInt();

        while (i <= n){
            facto = facto *1;
            i++;
        }
        System.out.printf("%d! = %d,", n, facto);
    }
}
