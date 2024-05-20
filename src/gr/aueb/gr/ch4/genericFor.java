package gr.aueb.gr.ch4;

import java.util.Scanner;

public class genericFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startV;
        int endV;
        int step;
        int inter = 0;

        System.out.println("please insrt");
        startV = in.nextInt();
        endV = in.nextInt();
        step = in.nextInt();

        for (int i = startV; i<= endV; i = i+ step){
            inter++;
            System.out.println("inerttion: "+ i + " ");
        }
        System.out.println("inter : " + inter);
    }
}
