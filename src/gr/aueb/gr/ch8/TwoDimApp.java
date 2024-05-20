package gr.aueb.gr.ch8;

public class TwoDimApp {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];
        arr1[0][2] = 10;

        for (int i = 0; i< arr1.length; i++){
            for (int j = 0; j < arr1[i].length ;j++){
                System.out.println(arr1[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
