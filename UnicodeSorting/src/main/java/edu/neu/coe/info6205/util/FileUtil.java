package edu.neu.coe.info6205.util;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileUtil {

    public static List<String> hindiWordsList(String fileName) {
        ClassLoader classLoader = FileUtil.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream(fileName);

        List<String> hindiWords = new ArrayList<>();

        if(!Objects.isNull(resourceAsStream)) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(resourceAsStream))) {

                String line = br.readLine();

                while (line != null) {
                    hindiWords.add(line);
                    line = br.readLine();
                }

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        return hindiWords;
    }

}