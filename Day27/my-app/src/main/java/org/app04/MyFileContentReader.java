package org.app04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyFileContentReader {

    public String readContentOfFile(File file) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(file);
        return "test";
    }

}
