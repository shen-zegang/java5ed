package com.boda.xy;

import java.nio.file.Path;
import java.nio.file.Paths;
public class PathDemo {
	public static void main(String[] args) {
		Path path = Paths.get("D:\\study\\user\\report.txt");
		IO.println("toString:" + path.toString());
		IO.println("getFileName:" + path.getFileName());
		IO.println("getName(0): " + path.getName(0));
		IO.println("getNameCount: " + path.getNameCount());
		IO.println("subpath(0,2): " + path.subpath(0,2));
		IO.println("getParent: " + path.getParent());
		IO.println("getRoot: " + path.getRoot());
	}
}
