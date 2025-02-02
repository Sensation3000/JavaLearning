package lesson2;

import java.util.Scanner;

public class Adder {

    public static void main(String[] args){
        int x = readInt("Enter X");
        int y = readInt("Enter Y");
        System.out.println(x + y);
    }

    static Scanner keyboard = new Scanner(System.in);

    private static int readInt(String message){
        System.out.println(message + ": ");
        return keyboard.nextInt();
    }

}
