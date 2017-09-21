/**
 * 
 */
package com.gmail.the.test1;

/**
 * @author zh
 *
 */
public class Three {

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println("9层:");
	printTriangle(9);
	System.out.println("10层:");
	printTriangle(10);
    }

    /**
     * @param num
     *            层数
     */
    public static void printTriangle(int num) {
	int[][] l = new int[num][num];

	for (int i = 0; i < num; i++) {
	    for (int j = 0; j <= i; j++) {

		// 生成数字
		if (j == i || j == 0) {
		    l[i][j] = 1;
		} else {
		    l[i][j] = l[i - 1][j - 1] + l[i - 1][j];
		}

		// 打印字符
		if (j == 0) {
		    System.out.format("%" + (2 + (num - i) * 2) + "d", l[i][j]);
		} else {
		    System.out.format("%4d", l[i][j]);
		}
	    }
	    System.out.println();
	}
    }

}
