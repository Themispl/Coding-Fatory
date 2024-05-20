package gr.aueb.gr.ch9;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileApp {
    public static void main(String[] args) {
        File fd = new File("c:/fjjf?dfjn.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(fd)){
            while (in.hasNextLine()){
                line = in.nextLine();
                tokens = line.split(" +");

                for (String token: tokens){
                    System.out.println(token + " ");
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
