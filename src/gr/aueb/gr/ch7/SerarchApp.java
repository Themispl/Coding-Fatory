package gr.aueb.gr.ch7;

public class SerarchApp {
    public static void main(String[] args) {
        final int SECRET = 9;
        boolean isFount = false;
        int position = -1;
        int[] arr = {1, 2, 3, 4, 5, 9};
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] == SECRET){
                isFount = true;
                break;
            }
        }
        if (isFount){
            System.out.println("found: " + SECRET);
        }else {
            System.out.println("not found");
        }
    }
}
