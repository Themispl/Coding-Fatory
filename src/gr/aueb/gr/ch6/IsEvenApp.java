package gr.aueb.gr.ch6;

public class IsEvenApp {
    public static void main(String[] args) {
        int num =11;
        boolean iseven = false;
        iseven = isEven(11);
        System.out.printf("%d is evev: %b",num ,iseven);
    }
    public static  boolean isEven(int num){
        return num % 2 == 0;

    }
}
