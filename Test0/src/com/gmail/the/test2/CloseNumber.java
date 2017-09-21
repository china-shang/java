package com.gmail.the.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CloseNumber {
	private static HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

	public static void main(String[] args) {
		find(10000);
	}

	/**
	 * 找出limit以内的亲密数
	 * 
	 * @param limit
	 */

	public static void find(int limit) {
		ArrayList<Integer> hasPrint = new ArrayList<Integer>();
		for (int a = 1; a < limit; a++) {
			int b = splitSum(a);
			if ((splitSum(b) == a) && (a != b)) {

				if (!hasPrint.contains(a) && !hasPrint.contains(b)) {
					System.out.format(Messages.getString("CloseNumber.0"), a, b); //$NON-NLS-1$
				}
				hasPrint.add(a);
			}
		}
	}

	/**
	 * 分解因数
	 * 
	 * @param num
	 * @return 分解的因素之和
	 * 
	 */
	private static int splitSum(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				// if (i != 1)
				sum += i;
			}
		}
		return sum;
	}

	public static void findTest(int limit) {
		for (int i = 1; i < limit; i++) {

			ArrayList<Integer> t = split(i);

			// 因数求和
			int sum = 0;
			for (Integer integer : t) {
				sum += integer;
			}
			// 存入数据
			if (map.containsKey(sum)) {
				map.get(sum).add(i);
			} else {
				map.put(sum, new ArrayList<Integer>(i));
			}

		}

		// 输出
		Set<Integer> i = map.keySet();
		for (Integer integer : i) {
			if (map.get(integer).size() > 1) {
				System.out.format(Messages.getString("CloseNumber.1"), integer); //$NON-NLS-1$
				// System.out.print(integer);
				// System.out.print(":");
				System.out.println(map.get(integer));
			}

		}

	}

	/**
	 * 分解因数
	 * 
	 * @param num
	 * @return 分解的因素
	 * 
	 */
	public static ArrayList<Integer> split(int num) {
		ArrayList<Integer> t = new ArrayList<Integer>();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				t.add(i);
			}
		}
		return t;

	}

}
