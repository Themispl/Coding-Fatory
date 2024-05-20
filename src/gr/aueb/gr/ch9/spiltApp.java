package gr.aueb.gr.ch9;

public class spiltApp {
    public static void main(String[] args) {
        String s = "Athens Uni Of Econ and Busin";
//etsi tou leo pou na kanei to spasimo se kathe lexi
        String[] tokens = s.split(" ");
        for (String token : tokens){
            System.out.println(token);
        }
    }
}
