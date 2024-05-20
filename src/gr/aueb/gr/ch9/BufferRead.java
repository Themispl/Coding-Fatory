package gr.aueb.gr.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String line;

        try(BufferedReader bf = new BufferedReader(new FileReader("C;/fjfj.txt"))){
            while ((line = bf.readLine()) != null){
                sb.append(line).append("\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(sb);
    }
}
