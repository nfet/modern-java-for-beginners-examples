package com.lagnada.modernj.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathManipulationExample {
  public static void main(String[] args) {
    // Creating a Path object
    Path path = Paths.get("/user/documents", "file.txt");

    // Retrieving individual components of the path
    System.out.println("File Name: " + path.getFileName());
    System.out.println("Parent Directory: " + path.getParent());
    System.out.println("Root Directory: " + path.getRoot());

    // Checking if the path is absolute
    System.out.println("Is Absolute Path: " + path.isAbsolute());

    // Normalizing the path
    Path normalizedPath = path.normalize();
    System.out.println("Normalized Path: " + normalizedPath);

    // Resolving a path against another path
    Path resolvedPath = path.resolve("subdir/data.txt");
    System.out.println("Resolved Path: " + resolvedPath);

    // Relativizing two paths
    Path path1 = Paths.get("/user/documents");
    Path path2 = Paths.get("/user/documents/files/file.txt");
    Path relativePath = path1.relativize(path2);
    System.out.println("Relative Path: " + relativePath);
  }
}

