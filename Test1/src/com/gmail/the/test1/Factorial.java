/**
 * 
 */
package com.gmail.the.test1;

/**
 * @author zh
 *
 */
public class Factorial {

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(factorial(4));

    }

    public static long factorial(int num) {
	if (num == 1) {
	    return 1;
	}
	return (factorial(num - 1) * num);

    }

}
