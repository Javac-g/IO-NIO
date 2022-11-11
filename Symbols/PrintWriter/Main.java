package Symbols.PrintWriter;

import java.io.PrintWriter;

public class Main {
    public static void main(String...args){
        PrintWriter printWriter = new PrintWriter(System.out,true);
        printWriter.println("This is line");
    }
}
