package com.gmail.the.test1;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class Test {
    public static void main(String[] args) {
	String input = "1 * 2 fish red fish blue fish";
	Scanner s = new Scanner(input);
	s.findInLine("(\\d+) ([+-/*]) (\\d+) fish (\\w+) fish (\\w+)");
	MatchResult result = s.match();
	for (int i = 1; i <= result.groupCount(); i++)
	    System.out.println(result.group(i));
	s.close();
    }

}
