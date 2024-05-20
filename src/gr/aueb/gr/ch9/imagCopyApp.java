package gr.aueb.gr.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class imagCopyApp {
    public static void main(String[] args) {

        try(FileInputStream fis =new FileInputStream("C:/Users/themi/IdeaProjects/CodingFactory/kefali.jpg");
            FileOutputStream fos = new FileOutputStream("C:/Users/themi/IdeaProjects/CodingFactory/kefali1.jpg")){

            int b;
            int count = 0;
            long start;
            long end;
            double elaspTime = 0.0;
            byte[] buf = new byte[4096];

            start = System.currentTimeMillis();
            while ((b = fis.read()) != -1){
                fos.write(b);
                count++;
            }
            end = System.currentTimeMillis();
            elaspTime = (end - start)/1000.0;
            System.out.printf("%dKB and %d", (count/1024), count);
            System.out.println(elaspTime);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
