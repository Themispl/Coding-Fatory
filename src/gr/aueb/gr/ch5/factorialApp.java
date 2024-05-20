package gr.aueb.gr.ch5;

import java.util.Scanner;

public class factorialApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int a = 2;
        int b = 10;

        System.out.println("insert num");
        n = in.nextInt();
        System.out.printf("%d! = %d", n,facto(n));
        System.out.printf("%d^%d = %d",a ,b ,pow(a, b));
    }
    public static  int facto(int n){
        int result = 1;

        for (int i = 1; i<= n; i++){
            result*= i;
        }
        return result;
    }
    public  static int pow(int a,int b){

        int power = 1;
        for ( int i = 1; i<= b;i++ ){
            power *= a;
        }
        return  power;
    }
}
