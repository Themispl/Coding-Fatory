package gr.aueb.gr.ch5;

public class equalApp {
    public static void main(String[] args) {
        double actual = 0.0;
        double expected = 1.0;
        final double EPSILON = 0.00005;

        for (int i = 1; i <= 10; i++){
            actual += 0.1;
        }
        System.out.printf("Actual : %.20f\n", actual);
        System.out.printf("Expected  : %.20f\n", expected);
        if (Math.abs(actual - expected) <= EPSILON){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
