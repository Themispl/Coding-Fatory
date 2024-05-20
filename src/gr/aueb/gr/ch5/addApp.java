package gr.aueb.gr.ch5;

/**
 * Methodos
 */
public class addApp {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int result = 0;

        result = add(a,b);
        System.out.printf(" %d + %d = %d", a, b, result);
    }

    public static int add(int a, int b){
       // int result = 0;
       // result = a +b;
       // return  result;
         return a + b;
    }
}
