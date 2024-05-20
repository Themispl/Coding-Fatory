package gr.aued.cf.ch2;

import java.util.Scanner;

public class carSpeed {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        final int max_speed = 100;
        boolean areLightson =false;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert if is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if is Dark" );
        isDark = in.nextBoolean();
        System.out.println("Please insert the speed ");
        speed = in.nextInt();

       isRaining = speed >= max_speed;
       areLightson = isRaining && (isRaining || isDark);
        System.out.println("Are lights on :" + areLightson);
    }
}
