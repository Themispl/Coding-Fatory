package gr.aueb.gr.ch7;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 6, 2, 12};
        int minPosition;
        minPosition = findposition(arr);
        System.out.printf("Min poti: %d, %d", arr[minPosition], minPosition + 1);
    }
    public  static  int findposition(int[] arr){
        int min = Integer.MAX_VALUE;//MIN_VALUE
        int minPosition = 0;//maxPosition
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min) {//arr[i] >max
                min = arr[i];//max=arr[i]
                minPosition = i;//maxPosition
            }
        }
        return  minPosition;
    }
}
