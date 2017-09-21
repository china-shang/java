package com.gmail.the.test1;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class Cal {

	@SuppressWarnings("resource")

	public static void main(String[] args) {
		float operatorSum2;
		float operatorSum1;

		String oper;
		Scanner sc = new Scanner(System.in);
		sc.findInLine("(-?\\d*.?\\d*)"
				+ "([+-/*]{1})"
				+ "(-?\\d*.?\\d*)");
		MatchResult result = sc.match();

		operatorSum1 = Float.parseFloat(result.group(1));
		operatorSum2 = Float.parseFloat(result.group(3));
		oper = result.group(2);
		float calResult;

		switch (oper) {
		case "+":
			calResult = operatorSum1 + operatorSum2;
			break;
		case "-":
			calResult = operatorSum1 + operatorSum2;
			break;
		case "/":
			calResult = operatorSum1 / operatorSum2;
			break;
		case "*":
			calResult = operatorSum1 * operatorSum2;
			break;
		default:
			System.out.println("operator Error!");
			return;
		}
		System.out.format("%.1f", calResult);

	}

}
