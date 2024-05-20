package gr.aueb.gr.ch1;

import java.util.Scanner;

public class Sum10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int count = 0;
     //   int i = 1;
       // int sum = 0;
      //  while (i <= 10){
      //      sum += i;
      //  }
        System.out.println("Please insert: start, step ,end");
        start = in.nextInt();
        end = in.nextInt();
        step = in.nextInt();
        while (start <= end){
            start += step;
            count++;
        }
        System.out.println("steps: " + count);
    }
}
