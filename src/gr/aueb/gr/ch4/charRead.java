package gr.aueb.gr.ch4;

import java.io.IOException;
import java.util.Scanner;

public class charRead {
    public static void main(String[] args) throws IOException {
        int inputChar1 = ' ';
        char inputChar2 = ' ';
        Scanner in = new Scanner(System.in);
        System.out.println("please insert char");
        inputChar1= System.in.read();
        System.out.println("ordinal : " + inputChar1);
        System.out.println("char :" + (char) inputChar1);
        System.out.println("please insert a char");
        inputChar2 = in.nextLine().charAt(0);
        System.out.println("unicode : " + inputChar2);
    }
}
