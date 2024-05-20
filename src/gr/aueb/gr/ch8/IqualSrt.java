package gr.aueb.gr.ch8;

public class IqualSrt {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = copy(s1);

        boolean equal1 = s1.equals(s2);
        boolean equal2 = s1.equalsIgnoreCase(s3);


    }
    public static String copy(String s){
        return s;
    }
}
