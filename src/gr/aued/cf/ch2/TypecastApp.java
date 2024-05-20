package gr.aued.cf.ch2;

/**
 * metatropes metaji duo tupon dodomenon
 */
public class TypecastApp {
    public static void main(String[] args) {
        int myint= 10;
        long mylong= 20;
        int myResult= 0;
        long myResultLong= 0;

        myResult= (int) (myint + myResultLong);
        myint = (int) mylong;//type cast
    }
}
