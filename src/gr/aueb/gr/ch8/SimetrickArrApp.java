package gr.aueb.gr.ch8;

public class SimetrickArrApp {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3 ,2 ,1};
        System.out.println("is symetric "+ isSymetrik(arr));
    }
//  vlepei an einai simetrikos kai apo tis duo pleures
    public static boolean isSymetrik(int[] arr){
        boolean symetric = true;

        for (int i = 0 , j = arr.length - 1; i<j; i++, j--){
            if(arr[i] != arr[j]){
                symetric = false;
                break;
            }
        }
        return symetric;
    }
}
