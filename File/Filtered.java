package File;

import java.io.File;

public class Filtered {
    public static void main(String[] args) {
        String p = "c:/Users/Max.000/IdeaProjects/IO_NIO/src/File";
        File f = new File(p);
        Filter filter = new Filter("java");
        File[] l2 = f.listFiles(filter);
        String[] list = f.list(filter);
        for (int i = 0;i < list.length;i++){
            System.out.println(l2[i]);
        }
    }
}
