package File;

import java.io.File;

public class Filtered {
    public static void main(String[] args) {
        String p = "c:/Users/Max.000/IdeaProjects/IO_NIO/src/File";
        File f = new File(p);
        Filter filter = new Filter("java");
        String[] list = f.list(filter);
        for (int i = 0;i < list.length;i++){
            System.out.println(list[i]);
        }
    }
}
