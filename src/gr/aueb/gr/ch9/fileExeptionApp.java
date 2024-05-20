package gr.aueb.gr.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class fileExeptionApp {
    public static void main(String[] args) {
        int num = 0;
        try {
            num = getNum();
        }catch (FileNotFoundException | InputMismatchException e){
           // e.printStackTrace();
            System.out.println("error");
        }
    }

    public static int getNum() throws FileNotFoundException, InputMismatchException {
        File fd= new File("c:/tmp/file.txt");
        int num = 0;

        try (Scanner in = new Scanner(fd)){
            num = in.nextInt();
        }catch (FileNotFoundException | InputMismatchException e){
            System.err.println("error.");
           // e.printStackTrace();
            throw e;
        }
        return num;
    }
}
