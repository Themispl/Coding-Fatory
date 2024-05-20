package gr.aueb.gr.ch7;

public class TravelArry {
    public static void main(String[] args) {

        int[] ages = {20, 25, 22, 40};
        //me index
        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i] + " ");
        }
        //xoris index
        for (int age : ages){
            System.out.println(age + " ");
        }
    }
}
