package com.boda.xy;
import java.io.*;
public class CopyFile {
	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			IO.println("Usage:java CopyFile <filename1> <filename2>.");
			System.exit(1);
		}
		File sourceFile = new File(args[0]);
		File destFile = new File(args[1]);
		FileInputStream in = new FileInputStream(sourceFile);
		FileOutputStream out = new FileOutputStream(destFile);
		int c;
		while ((c = in.read()) != -1) {
			out.write(c);
		}
		IO.println("File Copy Successfully.");
		in.close();
		out.close();
	}
}
