package File;

import java.io.File;

public class A {
    public static void main(String...args){
        String p = "c:/Users/Max.000/IdeaProjects/IO_NIO/src/File";
        File file = new File(p);
        if (file.isDirectory()){
            System.out.println(file.getName() + " is directory");
            String[] list = file.list();

            for (int i = 0 ; i < list.length;i++){
                File f = new File(p + "/"+list[i]);
                if (f.isDirectory()){
                    System.out.println(f.getName() + " is directory");
                }else{
                    System.out.println(f.getName() + " is a file");
                }

            }

        }else {
            System.out.println(file.getName() + " is not a directory");
        }
    }
}
