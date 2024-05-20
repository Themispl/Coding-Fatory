package gr.aueb.gr.ch6;

import java.util.Scanner;

public class MinMaxAvergApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;
        int average = 0;
        int sum = 0;

        System.out.println("plese insert a few int , 0= ext");
        while ((num = in.nextInt()) !=0){
            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }

            sum += num;
            count++;
        }
        System.out.println("min:" + min);
        System.out.println("Max" + max);
        System.out.printf("Average : %.2f", ((double) sum / count));
    }

}
