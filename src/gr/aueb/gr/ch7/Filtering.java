package gr.aueb.gr.ch7;

public class Filtering {
    public static void main(String[] args) {
        int[] arr = {1, 2 , 3 ,4};
        int[] evenArr= filterEven(arr);
        traverse(evenArr);
    }

    public static int[] filterEven(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int count = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }
    int[] returnArr = new int[count];
    count=0;
    for (int item :arr){
        if( item % 2 == 0){
            returnArr[count] = item;
            count++;
        }
    }
    return returnArr;
}
public static void traverse(int[] arr){
        for (int element : arr){
            System.out.println(element + " ");
        }
}
}
