package com.gmail.the.test1;

import java.util.Scanner;

public class InputTest {

    private static Scanner sc;

    public static void main(String[] args) {
	sc = new Scanner(System.in);
	Scanner sc2 = sc;
	String s = sc2.nextLine();
	System.out.println(s);

    }

}