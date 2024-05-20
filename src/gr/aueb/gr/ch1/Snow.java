package gr.aueb.gr.ch1;

import java.util.Scanner;

public class Snow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Please insert if is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert outside temp ");
        temp= in.nextInt();

        isSnowing = isRaining && (temp < 0);
        System.out.println(" Is Snowing");
    }
}
