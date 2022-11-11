package File;

import java.io.File;

public class Main {

    static String f = "c:/Users/Max.000/IdeaProjects/IO_NIO/src/Bytes/File/logger.dat";
    static void p(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        File file = new File(f);
        p("Name: " + file.getName());
        p("Absolute Path: " + file.getAbsolutePath());
        p("Path: " + file.getPath());

    }
}
