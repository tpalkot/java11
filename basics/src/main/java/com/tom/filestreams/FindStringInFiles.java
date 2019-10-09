package com.tom.filestreams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class FindStringInFiles {

    public static class FileVisitor extends SimpleFileVisitor<Path> {

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                throws IOException {
            if (attrs.isDirectory() && dir.getFileName().endsWith(".git")) {
                return FileVisitResult.SKIP_SUBTREE;
            }
            return FileVisitResult.CONTINUE;
        }
    }

    public static void main(String[] args) throws IOException {
        // CopyOnWriteArrayList<E>
        

        Path rootPath =
                Files.walkFileTree(Path.of("/Users/tom/checkouts/smpcore/"), new FileVisitor());
        
        try (Stream<Path> javaFiles = Files.walk(rootPath)) {
                

            javaFiles.filter(path -> path.getFileName().toFile().getName().endsWith(".java"))
                    .flatMap(path -> {
                try {
                            return Files.lines(path, StandardCharsets.ISO_8859_1);
                } catch (IOException e) {

                    throw new RuntimeException(e);
                }
                    }).filter(s -> s.contains("CopyOnWriteArrayList"))
                .forEach(System.out::println);
                

        }


    }

}
