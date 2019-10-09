package com.tom.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class Type {

    private static void processFile(String file) {
        
        try (Stream<String> lines = Files.lines(Path.of(file))) {

            lines.forEach(System.out::println);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    public static void main(String[] files) {

        Arrays.stream(files).forEach(Type::processFile);

    }
}
