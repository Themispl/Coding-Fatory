package gr.aueb.gr.ch8;
//find the index
public class FindPositionOrIndex {
    public static void main(String[] args) {
        String s ="Coding Factory";

        int positionOf = s.indexOf('o');
        int posNext = s.indexOf( "Fa", 2);
        System.out.println("find position : " + positionOf);
        System.out.println("find position : " + posNext);
        String odToEnd = s.substring(1);
        System.out.println(odToEnd);
        String od = s.substring(1 , 3);
        System.out.println(od);
    }
}
