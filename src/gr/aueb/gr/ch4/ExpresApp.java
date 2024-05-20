package gr.aueb.gr.ch4;

public class ExpresApp {
    public static void main(String[] args) {
        long intNum = 10;
        float floatNum = 0.8F;
        double doubleNum = 12.8;

        float resultFloat = 0;
        double resultDouble = 0;

        resultFloat = floatNum + intNum;
        resultDouble = doubleNum + floatNum + intNum;

        System.out.printf("Result Float : %f\n", resultFloat);
        System.out.printf("Result Double : %f", resultDouble);
    }
}
