package File;

import java.io.File;
import java.io.FilenameFilter;

public class Filter implements FilenameFilter {
    String ext;

    public Filter(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
