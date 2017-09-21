/**
 * 
 */
package com.gmail.the.test1;

/**
 * @author zh
 *
 */
public class Summarize {

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(sum(20));

    }

    public static double sum(double num) {
	double sum = 0;
	for (double up = 1, down = 2, i = 1; i <= num; i++) {
	    sum += up / down;

	    double t = up;
	    up = down;
	    down += t;
	}
	return sum;
    }

}
