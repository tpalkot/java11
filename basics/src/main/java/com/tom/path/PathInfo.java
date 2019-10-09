package com.tom.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfo {

    public static void main(String[] args) {

        // name/root/parent/elements
        Path distPath = Path.of("/tmp/dist.zip");
        Paths.get("/tmp/dist.zip");

        System.out.printf("Name of the file: %s%n", distPath.getFileName());

        System.out.printf("Root of the file: %s%n", distPath.getRoot());

        System.out.printf("Parent of the file: %s%n", distPath.getParent());

        distPath.forEach(System.out::println);
    }
}
