package com.gmail.the.test1;

public class Pi {

	public static void main(String[] args) {

		double r = 4_0000;
		double inner = 0;
		double total = r * r;

		for (double x = 0; x < r; x++) {
			for (double y = 0; y < r; y++) {

				if (x * x + y * y < (r - 1) * (r - 1)) {
					inner++;
				} else
					if (x * x + y * y < r * r) {
						inner += 0.5;
					}
			}
		}

		double pi = (double) inner / total * 4;
		System.out.format("PI=%f\n", pi);
		System.out.format("Math.PI=%f\n", Math.PI);

		double deviation;
		if (Math.PI > pi) {
			deviation = Math.PI - pi;
		} else {
			deviation = pi - Math.PI;
		}
		System.out.format("误差：%f", deviation);
	}

}
