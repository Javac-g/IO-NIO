package Bytes.File_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    static String one = "c:/Users/Max.000/IdeaProjects/IO_NIO/src/Bytes/File_IO/Texts/One.txt";
    static String two = "c:/Users/Max.000/IdeaProjects/IO_NIO/src/Bytes/File_IO/Texts/Two.txt";
    static void reader(String file){

        if(file == null){
            System.out.println("Permission wrong");
        }
        try(FileInputStream fileInputStream = new FileInputStream(file)) {

            int i = 0;

            do {
                i = fileInputStream.read();

                System.out.print((char)i + "");

            }while (i != -1);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
    static void copier(String file,String copy){
        if(file == null || copy == null){
            System.out.println("File not found");
        }
        try(FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(copy,true)){
            int i = 0;


            do{
                i = fileInputStream.read();
                    fileOutputStream.write(i);
            }while (i != -1);



        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("\nDone: ");
        }
    }
    public static void main(String...args){
        reader(one);
        copier(one,two);
    }
}
