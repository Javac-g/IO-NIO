package Symbols.BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String...args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char c;

        System.out.println("Type q - to quite");

        do{

            c = (char) bufferedReader.read();
            System.out.print(c + "_");

        }while (c != 'q');
    }
}
