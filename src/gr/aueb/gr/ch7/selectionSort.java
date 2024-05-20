package gr.aueb.gr.ch7;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {19, 44 , 5 , 20 , 6 , 18};
        Arrays.sort(arr);
        traversArry(arr);
    }
    public  static  void selection(int[] arr){
        if (arr == null ) return;
        int min;
        int minPosition;
        for (int i = 0; i <arr.length - 1;i++){
            minPosition =i;
            min = arr[i];
            for (int j = i+1; j <arr.length; j++){
                if( arr[j] < min){
                    min = arr[i];
                    minPosition =j;
                }
            }
            swap(arr, i , minPosition);
        }
    }
    public  static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void traversArry(int[] arr){
        for (int element : arr){
            System.out.println(element + " ");
        }
    }
}
