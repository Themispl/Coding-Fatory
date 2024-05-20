package gr.aueb.gr.ch4;

public class ForApp {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            System.out.print(i + " ");
        }

        //sum
        int sum = 0;
        int mul = 1;
        for (int i = 1; i <=10; i++){
            sum += i;
            mul += i;
        }
        System.out.println("sum :" + sum);
        System.out.println("sum :" + mul);
    }
}
