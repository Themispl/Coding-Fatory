package gr.aueb.gr.ch7;

public class QueueApp {
    static  int[] queue = new  int[100];
    static int pivot = -1;

    public static void main(String[] args) {

    }
    public static  void enQueue(int num){
        queue[++pivot] = num;
    }
    public static  int deQueue(){
        int valueToRetern = queue[0];
        pivot--;
        shiftQueueLeft();
        return  valueToRetern;
    }
    public static void shiftQueueLeft(){
        for (int i = 0; i <= pivot; i++){
            queue[i]= queue[i+1];
        }
    }
    public static boolean isEmpty(){
        return  pivot == queue.length -1;
    }
}
