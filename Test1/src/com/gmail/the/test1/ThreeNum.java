/**
 * 
 */
package com.gmail.the.test1;

/**
 * @author zh
 *
 */
public class ThreeNum {

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(find());

    }

    public static int find() {
	int result = 0;
	for (int ten = 0; ten < 8; ten++) {
	    for (int hundred = ten + 1; hundred < 9; hundred++) {
		for (int digit = hundred + 1; digit < 10; digit++) {
		    if (digit * ten * hundred == (digit + ten + hundred)) {
			result = digit + ten * 10 + hundred * 100;
		    }
		}
	    }
	}
	return result;
    }

}
