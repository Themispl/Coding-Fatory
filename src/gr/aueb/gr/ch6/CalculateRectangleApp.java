package gr.aueb.gr.ch6;

import java.util.Scanner;

public class CalculateRectangleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double erea = 0.0;

        System.out.println("dwse tis duo pleures");
        height = in.nextDouble();
        width = in.nextDouble();
        erea = calculate(width, height);
        System.out.println("Emvado " + erea);
    }

    public static double calculate(double width, double height){
        return  width * height;
    }
}
