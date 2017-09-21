package com.gmail.the.test1;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {

		PrintABC p = new PrintABC();

		new Thread(new Runnable() {
			public void run() {
				p.print("A");
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				p.print("B");
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				p.print("C");
			}
		}).start();

		Thread.sleep(10_000);

	}

}
