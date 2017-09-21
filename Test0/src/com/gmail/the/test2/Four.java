package com.gmail.the.test2;

import java.util.ArrayList;

public class Four {
	public static void main(String[] args) {
		int t = doGetMax(1234);
		System.out.println(t);

	}

	public static int doGetMax(int num)
	{
		ArrayList<Integer> t = new ArrayList<Integer>();

		t.add(num % 10);
		for(int i=1;i<4;i++) {
			num/=10;
			t.add(num % 10);
		}

		t.sort(null);
		int result = 0;
		for (int i = t.size() - 1; i >= 0; i--) {
			result = result * 10 + t.get(i);

		}

		return result;
	}

}
