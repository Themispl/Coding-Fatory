package gr.aueb.gr.ch7;

public class GetSum {
    public static void main(String[] args) {
        int[] arr= {1, 5 ,6 ,7 , 15, 55};
        System.out.println("sum="+ getSum(arr) +" "+"avrg="+ getAver(arr));
    }
    public static int getSum(int[] arr){
        if(arr == null || arr.length == 0)return  -1;
        int sum = 0;

        for (int item : arr){
            sum += item;

        }
        return  sum;
    }
    public static int getAver(int[] arr){
        if(arr == null || arr.length == 0)return  -1;
        int sum = 0;

        for (int item : arr){
            sum += item;

        }
        return  sum/ arr.length;
    }
}
