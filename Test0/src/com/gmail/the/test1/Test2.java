package com.gmail.the.test1;

import java.util.Scanner;

public class Test2 {

    // public Test2() {
    // B b = new B();
    // }
    void test() {
	System.out.println("A");
    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String inputString = scanner.nextLine();
	do {
	    inputString = "hello";
	    break;
	} while (true);

	for (int i = inputString.length() - 1; i >= 0; i--) {
	    System.out.print(inputString.charAt(i));
	}
	System.out.println();
	scanner.close();
	// B b = new B();
	// b.test();

    }

}

class B extends Test2 {
    void test() {
	super.test();
	System.out.println("B");
    }
}
