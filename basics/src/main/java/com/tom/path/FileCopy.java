package com.tom.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        Path source = Path.of("/tmp/dist.zip");
        Path target = Path.of("/tmp/dist2.zip");

        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }

}
