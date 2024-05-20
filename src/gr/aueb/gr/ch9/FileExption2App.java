package gr.aueb.gr.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileExption2App {
    public static void main(String[] args) {
        int num = 0;

        try{
           num = getNum();
            System.out.println("ola kala");
        } catch (FileNotFoundException e){
            System.out.println("file not fount");
        }catch (InputMismatchException e){
            System.out.println("error");
        }catch (ArithmeticException e){
            System.out.println("lathos arithmos");
        }
    }


    public static  int getNum() throws FileNotFoundException,InputMismatchException, ArithmeticException {
        File fb = new File("c:/hdhf/fhfj.txt");
        int num = 0;

        try (Scanner in = new Scanner(fb)){
            if (!in.hasNextInt()){
                throw new InputMismatchException();
            }
            num = in.nextInt();
            if(num < 0){
                throw  new ArithmeticException("negativeNum");
            }

        }catch (FileNotFoundException | InputMismatchException | ArithmeticException e){
           // e.printStackTrace();
            throw  e;
        }
        return num;
    }
}
