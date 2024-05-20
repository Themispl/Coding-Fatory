package gr.aued.cf.ch2;

/**
 * pro8eti duo int kai dinei apotelesma
 */
public class AddUp {
    public static void main(String[] args) {
        //set values
        int num1=7;
        int num2=12;
        int result=0;

        //entoles
        result = num1 + num2 ;
        System.out.printf("Type: %s, Size: %d \n", Integer.TYPE,Byte.SIZE);
        System.out.printf("Type: %s, Size: %d  , Bite: %,d \n",Integer.TYPE,Integer.SIZE,Integer.MAX_VALUE);
        System.out.printf("to sunolo %d + %d =%d ",num1,num2,result);
        System.out.println("To sunolo einai "+ num1+" " + num2+" " + result);
    }
}
