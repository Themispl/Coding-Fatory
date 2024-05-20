package gr.aued.cf.ch2;

public class ExpressionsApp {
    public static void main(String[] args) {
        int num1= 10;
        int num2= 20;
        int num3= 12;
        int num4= 17;

        int result1= 0;
        int result2= 0;
        int result3= 0;
        int result4= 0;

        result1= num1 + num2;
        result2= num2 - num4;
        result3= num3 * num4;
        result4= num4 / num3;
        System.out.printf("sum: %d, %d , %d, %d",result1,result2,result3,result4);
    }
}
