package com.gmail.the.test2;

import java.util.ArrayList;

/**
 * 为降低时间复杂度，把可能使用到的素数储存起来
 * 不用每次都判断一次某数是否是素数
 * 
 * 时间复杂度从O(n^2.5)变为O(n*f(n))
 * 空间复杂度变为O(f(n))
 * 
 * f(n)为n以内的素数个数
 *
 * @author zh
 * 
 */
public class GuessProof {
	// 存储素数
	private ArrayList<Long> primeArray = new ArrayList<Long>();

	// 准备证明到的上限
	private long limit;

	// 从此开始找素数
	private long leftLimit = 3;

	public GuessProof(long limit) {
		this.limit = limit;
		primeArray.add((long) 2);
	}

	public void proof() {
		for (long testNumber = 6; testNumber <= limit; testNumber += 2) {
			if (isTrue(testNumber)) {
				if (testNumber % 10000 == 0) {
					System.out.println(testNumber);

				}
			} else {
				System.out.println("证明失败");

			}
		}

	}

	/**
	 * 找出rightLimit之内的素数并储存
	 * 
	 * @param rightLimit
	 */
	private void findAllPrime(long rightLimit) {

		for (long testNumber = leftLimit; testNumber <= rightLimit; testNumber++) {
			for (int index = 0; index < primeArray.size(); index++) {

				long prime = primeArray.get(index);
				if (prime * prime >= testNumber) {
					primeArray.add(testNumber);
					break;
				} else
					if (testNumber % prime == 0) {
						break;
					}
			}
		}
		leftLimit = rightLimit;

	}

	/**
	 * 验证testNumber是否符合定律
	 * 
	 * @param testNumber
	 * @return
	 * 
	 */
	private boolean isTrue(long testNumber) {
		findAllPrime(testNumber);
		for (Long leftNumber : primeArray) {
			if (leftNumber > testNumber / 2) {
				return false;
			}

			long rightNumber = testNumber - leftNumber;
			if (primeArray.contains(rightNumber)) {
				return true;
			}
		}
		return false;
	}
}
