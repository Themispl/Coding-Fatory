package gr.aueb.gr.ch6;

public class MathApp {
    public static void main(String[] args) {
       double d = 3.45;
        System.out.printf("%.2f: ceil: %d, floor: %d\n", d , getCeil(d), getFloor(d));
        System.out.println("apo :"+ getRandom(1, 100));
    }
    public static int getCeil(double num){
        return (int)Math.ceil(num);
    }
    public  static int getFloor(double num){
        return (int)Math.floor(num);
    }
    public static  int getRandom(int min, int max){
        return (int)(Math.random() * (max - min +1)+ min);
    }
}
