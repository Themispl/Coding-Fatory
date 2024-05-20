package gr.aueb.gr.ch5;
import java.util.Scanner;

/**
 * elenxei an einai orthogonio
 */
public class RightTriangl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0.0; //ypotinoysa
        double b = 0.0;
        double c = 0.0;
        boolean isRight = false;
        final double EPSILON = 0.00005;

        System.out.println("vale tis treis pleures");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        isRight = Math.abs(a*a - b*b-c*c) <= EPSILON;
        System.out.println("to trigono einai : " + isRight);
    }
}
