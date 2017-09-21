package com.the.test0;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Stream {

	public static void main(String[] args)
			throws FileNotFoundException, IOException {
		byteFileStream();
		charFileStream();
		bufferStream();
		scan();
	}

	public static void byteFileStream()
			throws FileNotFoundException, IOException {
		String inputName = "testByteout.txt";
		String outputName = "testByte.txt";
		try (FileOutputStream out = new FileOutputStream(inputName);
				FileInputStream in = new FileInputStream(outputName);) {

			int t;
			while ((t = in.read()) != -1) {
				out.write(t);
			}
		}
	}

	public static void charFileStream()
			throws FileNotFoundException, IOException {
		String inputName = "testChar.txt";
		String outputName = "testCharout.txt";
		try (FileReader reader = new FileReader(inputName);
				FileWriter writer = new FileWriter(outputName)) {

			int t;
			while ((t = reader.read()) != -1) {
				writer.write(t);
			}
		}
	}

	public static void bufferStream()
			throws FileNotFoundException, IOException {
		String inputName = "testBuffer.txt";
		String outputName = "testBufferout.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(inputName));
				// PrintWriter 也实现了Buffer
				PrintWriter writer = new PrintWriter(new FileWriter(outputName))) {

			String s;
			while ((s = reader.readLine()) != null) {
				writer.println(s);
			}
		}
	}

	public static void scan() throws FileNotFoundException {
		String inputName = "testScanner.txt";
		try (Scanner scanner = new Scanner(new FileReader(inputName))) {

			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		}
	}
}
