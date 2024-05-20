package gr.aueb.gr.ch8;

import java.util.Scanner;

public class ImmutablStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("plesae insert two strings");
        s1 = in.next();//diazei mexri na vrei keno h \t...
        s2 = in.nextLine(); //diavazei mexri na vrei \n

        System.out.printf("s1: %s\n" , s1);
        System.out.printf("s2: %s\n" ,s2);
    }
}
