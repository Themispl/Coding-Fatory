package gr.aueb.gr.ch6;

import java.util.Scanner;

public class FarenaiteCelcis {
    public static void main(String[] args) {
        for (int i = -100; i <= 100; i+=10){
            System.out.printf("%4d\u2109\t=\t%6.2f\u2103\n",i,covert(i));
        }

//        Scanner in = new Scanner(System.in);
//        double faren = 0.0;
//        double cel= 0.0;
//        System.out.println("dwse toys thermokrasia");
//        faren = in.nextDouble();
//        cel = covert(faren);
//        System.out.println("h thermokrasia einai : " + cel);
    }
    public static double covert(double farent){
        return (farent - 32) *5 / 9 ;
    }
}
