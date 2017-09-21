package com.gmail.the.test1;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {

		Scanner scaner = new Scanner(System.in);
		int max = scaner.nextInt();
		while (max % 2 == 1) {
			System.out.println("奇数值无法成菱形,重新输入");
			max = scaner.nextInt();
		}
		scaner.close();

		for (int y = 0; y <= max; y++) {
			for (int x = 0; x <= max; x++) {
				/*
				 * 画出图像，由数学知识可得：
				 * 被4条直线围起来的位置应输出*
				 * 否则输出' '
				 * 
				 */
				/*
				 * if 内表示菱形外区域；
				 */
				if ((y < -x + max / 2) || (y < x - max / 2)
						|| (y > x + max / 2) || (y > -x + 3 * max / 2)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();

		}
	}

}
