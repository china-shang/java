/**
 * 
 */
package com.gmail.the.test1;

/**
 * @author zh
 *
 */
public class Peach {

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(calPeach(4));

    }

    /**
     * @param days
     *            吃了的天数
     * @return 初始数
     */
    public static int calPeach(int days) {

	int remainSum = 1;
	for (int i = days - 1; i >= 1; i--) {
	    remainSum = (remainSum + i) * 2;
	}
	return remainSum;

    }

}
