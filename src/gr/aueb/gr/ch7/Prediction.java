package gr.aueb.gr.ch7;

public class Prediction {
    public static void main(String[] args) {
        int[] arr = {1, -10, 5, 95, 6};
        System.out.println("ena"+ areAllPosetive(arr));
        System.out.println("ena"+ areGTEven(arr, 1));
        System.out.println("ena"+ hasOnePositive(arr));
        System.out.println("ena"+ areSameGroupFoten(arr, 2));
    }

    public static boolean hasOnePositive(int[] arr) {
        boolean hasPositive = false;
        for (int item : arr) {
            if (item > 0) {
                hasPositive = true;
                break;
            }
        }
        return hasPositive;
    }

    public static boolean areAllPosetive(int[] arr) {
        int count = 0;
        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count == arr.length;
    }

    public static boolean areLesPosetive(int[] arr, int thresh) {
        int count = 0;
        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count <= thresh;
    }

    public static boolean areGTEven(int[] arr, int threshold) {
        int count = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }
        return count >= threshold;
    }

    public static boolean areGTodd(int[] arr, int threshold) {
        int count = 0;
        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return count >= threshold;
    }

    public static boolean areSameEnding(int[] arr, int trheshold) {
        int[] andings = new int[10];
        boolean sameEnding = false;


        for (int item : arr) {
            andings[item % 10]++;
        }
        for (int item : andings) {
            if (item > trheshold) {
                sameEnding = true;
                break;
            }
        }
        return sameEnding;
    }

    public static boolean areSameGroupFoten(int[] arr, int trheshold) {
        int[] tens = new int[10];
        boolean sameTen = false;


        for (int item : arr) {
            tens[item % 10]++;
        }
        for (int item : tens) {
            if (item > trheshold) {
                sameTen = true;
                break;
            }
        }
        return sameTen;
    }
}