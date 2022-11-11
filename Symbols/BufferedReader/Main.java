package Symbols.BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static void textEditor(String stop) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = new String[10];
        System.out.println("Enter 10 lines");
        System.out.println("To stop type: " + stop);
        for (int i = 0 ; i < lines.length;i++){
            lines[i] = bufferedReader.readLine();
            if (lines[i].equals(stop)){
                break;
            }
        }
        System.out.println("Your file contains: ");
        for (String x : lines){
            if (x.equals(stop)){
                break;
            }
            System.out.println(x);
        }
    }
    static void readChars(char stop) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char c;

        System.out.println("Type q - to quite");

        do{

            c = (char) bufferedReader.read();
            System.out.print(c + "_");

        }while (c != stop);

    }
    static void readLines(String stop) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String c;

        System.out.println("Type stop - to quite");

        do{

            c = bufferedReader.readLine();
            System.out.println(c);

        }while (!c.equals(stop));
    }
    public static void main(String...args) throws IOException {
//         readChars('e');
//        readLines("stop");
        textEditor("qwerty");
    }
}
