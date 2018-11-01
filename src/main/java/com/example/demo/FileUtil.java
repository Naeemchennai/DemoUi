package com.example.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtil {

    public static String readFile(final String location) {

        try {
            String xml = new String(Files.readAllBytes(Paths.get(location)));
            return xml;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
