package gr.aueb.gr.ch8;

public class Travers {
    public static void main(String[] args) {
        String s = "thelo kati";

        for (int i = 0;i< s.length(); i++){
            System.out.print(s.substring(i, i+1));
        }
    }
}
