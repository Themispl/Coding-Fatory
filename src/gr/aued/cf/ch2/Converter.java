package gr.aued.cf.ch2;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        int euros = 0;
        int dollars = 0;
        int cent = 0;
        int remainC = 0;
        int totalC = 0;
        final int C_PARITY = 99;

        Scanner in = new Scanner(System.in);
        System.out.println("vale ta lefta se euro");
        euros = in.nextInt();

        cent = euros * C_PARITY;
        totalC = euros * C_PARITY;
        dollars = cent / 100;
        remainC = totalC % 100;
        System.out.printf("US Dollars: %,d , Cent: %,d , totals: %,d",dollars,cent,remainC );
    }
}
