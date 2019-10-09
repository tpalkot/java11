package com.tom.path;

import java.io.File;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfo2 {

    public static void main(String[] args) throws IOException {
        // filename,uri,aboslutepath,normalize

        //Path path = Paths.get("./target/basics-1.0-SNAPSHOT.jar");
        Path path = (new File("./target/basics-1.0-SNAPSHOT.jar")).toPath();


        System.out.println("Filename: " + path.getFileName());
        System.out.println("URI: " + path.toUri());
        System.out.println("AbsolutePath: " + path.toAbsolutePath());
        System.out.println("Normalized: " + path.normalize());

        // normalized path
        Path testPathNormalized = Paths.get(path.normalize().toString());
        System.out.println("Its normalized absolute path is: " +
                testPathNormalized.toAbsolutePath());
        System.out.println("Its normalized real path is: " +
                path.toRealPath(LinkOption.NOFOLLOW_LINKS));

        // realpath

    }

}
