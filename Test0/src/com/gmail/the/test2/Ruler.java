package com.gmail.the.test2;

public class Ruler {
	private Child[] childs;

	public Ruler() {
		childs = new Child[10];
		childs[0] = new Child(10);
		childs[1] = new Child(2);
		childs[2] = new Child(8);
		childs[3] = new Child(22);
		childs[4] = new Child(16);
		childs[5] = new Child(4);
		childs[6] = new Child(10);
		childs[7] = new Child(6);
		childs[8] = new Child(14);
		childs[9] = new Child(20);
		// 设置右边的孩子
		for (int i = 0; i < 10; i++) {
			childs[i].setRight(childs[(i + 1) % 10]);

		}
	}

	/**
	 * 
	 * 按规则开始处理
	 */
	public void handle() {

		int count = 0;
		while (!equalAll()) {
			// 为保证同时进行，分步完成分糖果
			count++;
			// 所有孩子把应给的糖果放在地上
			for (Child child : childs) {
				child.put();
			}
			// 所有孩子把地上给他的糖果拿起
			for (Child child : childs) {
				child.get();
			}
			// 所有孩子尝试从老师那获取一个糖果
			for (Child child : childs) {
				child.tryGetFromTeacher();
			}
		}

		for (Child child : childs) {
			System.out.println(child.getSweetCount());
		}
		System.out.println("次数:" + count);

	}

	private boolean equalAll() {
		for (int i = 0; i < 10; i++) {
			if (!(childs[i].getSweetCount() == childs[(i + 1) % 10].getSweetCount())) {
				return false;
			}
		}
		return true;

	}

}
