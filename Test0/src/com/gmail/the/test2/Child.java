package com.gmail.the.test2;

public class Child {

	private int sweetCount;
	private int increaseCount;
	private Child Right;

	public Child(int count) {
		this.setSweetCount(count);
	}

	public void addSweetCount(int increaseCount) {
		this.sweetCount += increaseCount;

	}

	public void get() {
		this.Right.addSweetCount(increaseCount);

	}

	public void put() {
		increaseCount = sweetCount / 2;
		this.setSweetCount(sweetCount / 2);
	}

	public int getSweetCount() {
		return sweetCount;
	}

	public void tryGetFromTeacher() {
		if (sweetCount % 2 == 1) {
			sweetCount++;
		}

	}

	public void setSweetCount(int count) {
		this.sweetCount = count;
	}

	public void setRight(Child Right) {
		this.Right = Right;
	}

}
