package com.gmail.the.test1;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		System.out.println("Input r,please!");
		Scanner scanner = new Scanner(System.in);
		float r = scanner.nextFloat();
		scanner.close();

		System.out.print("s=");
		System.out.println((int) Math.PI * r * r);

	}

}
