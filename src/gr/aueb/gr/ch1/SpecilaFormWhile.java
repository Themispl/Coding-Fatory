package gr.aueb.gr.ch1;

import java.util.Scanner;

public class SpecilaFormWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i =0;
        int choice = 0;
        while (i<=0){
            System.out.println("Never Get in");
            i++;
        }
        while (i <=1){
            System.out.println("only one time");
            i++;
        }
        do{
            System.out.println("Dialexe ena CRUDc");
            System.out.println("1: insert");
            System.out.println("2. update");
            System.out.println("3. delete");
            System.out.println("4. Select");
            choice = in.nextInt();
        }while (choice != 0);
        System.out.println("ty");
    }
}
