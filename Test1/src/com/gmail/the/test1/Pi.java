/**
 * 
 */
package com.gmail.the.test1;

/**
 * @author zh
 *
 */
public class Pi {

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(calPi(307200));

    }

    public static double calPi(double num) {

	double i = 3;

	double r = 1;
	double l = r * Math.sqrt(3);

	do {
	    i *= 2;
	    l = Math.sqrt(2 - Math.sqrt(4 - l * l));

	} while (i < num);

	return (l * i / (2 * r));

    }

}
