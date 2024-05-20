package gr.aueb.gr.ch7;

public class PopulateArray {
    public static void main(String[] args) {
        //1os tropos
        int[] arr = new int[5];
        arr[0]= 1;
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 30;
        arr[4] = 60;
        System.out.println(arr[0]);
        System.out.println(arr[4]);

        //2os tropos
        int[] arr2 = {1, 2 ,3 , 4, 5};
        System.out.println(arr2[0]);
        System.out.println(arr2[3]);

        //3os tropos
        int[] arr3 = new int[]{1, 2, 3, 5, 7};
        System.out.println(arr3[0]);
        System.out.println(arr3[4]);
    }
}
