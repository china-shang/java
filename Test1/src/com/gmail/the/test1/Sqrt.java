/**
 * 
 */
package com.gmail.the.test1;

/**
 * @author zh
 *
 */
public class Sqrt {

    /**
     * @param args
     */
    public static void main(String[] args) {

	System.out.println(sqrt(100));
    }

    public static double sqrt(double arg) {

	double limit = 1e-6;
	double deviation, x = arg;

	do {
	    x = (x + arg / x) / 2;
	    deviation = Math.abs(x * x - arg);
	} while (deviation > limit);

	return x;

    }

}
