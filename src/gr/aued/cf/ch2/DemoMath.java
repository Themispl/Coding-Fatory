package gr.aued.cf.ch2;

import java.util.Scanner;

public class DemoMath {
    public static void main(String[] args) {
        System.out.printf("to mikrotero:" + Math.min(3, 7));
        System.out.printf("to -10 einai:" + Math.abs(-10));
        int Dice = (int)(Math.random()*6)+ 1;
        System.out.printf("zari: %d",Dice);
        //diavazei apo ton xristi
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        //entoles
        System.out.println("vale duo times");
        num1= in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.printf("edoses: %d",sum);

    }
}
