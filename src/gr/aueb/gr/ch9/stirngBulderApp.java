package gr.aueb.gr.ch9;

public class stirngBulderApp {
    public static void main(String[] args) {
        String concatStr= "";
        StringBuilder sb =new StringBuilder();


        long timeStart = 0L;
        long timeend = 0L;
        double stringElapsTime = 0.0;
        double sbElapsTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 50_000; i++){
            concatStr +=i;
        }
        timeend = System.currentTimeMillis();
        stringElapsTime = (timeend - timeStart)/ 1000.0;

        System.out.println(stringElapsTime);
    }
}
