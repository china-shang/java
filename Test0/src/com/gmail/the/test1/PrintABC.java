package com.gmail.the.test1;

public class PrintABC {

	private String now = "A";

	public synchronized void print(String arg) {
		while (true) {
			if (now.equals(arg)) {
				System.out.println(arg);
				add();
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				this.notifyAll();

			} else {
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

	private void add() {
		switch (now) {
		case "A":

			now = "B";
			break;
		case "B":

			now = "C";
			break;
		case "C":

			now = "A";
			break;

		default:
			break;
		}

	}

}
