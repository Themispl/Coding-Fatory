package gr.aued.cf.ch2;
import java.math.BigInteger;

public class OverFlow {
    public static void main(String[] args) {
        int num1= 254_668_521;
        int num2 = 52;
        int result= 0;
        result= num2 +num1;
        BigInteger reselt1= new BigInteger("5464377437255155115155151515515151584");
        System.out.printf("Data: %d, Data2: %d",result,reselt1);
    }
}
