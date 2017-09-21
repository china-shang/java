package com.gmail.the.CarMeter;

public class App {

    public static void main(String[] args) {

	// CarMeter carMeter = new CarMeter(7, 2);
	// 有参的构造函数接收参数为 -> （起步价，每公里价格)


	CarMeter carMeter = new CarMeter(7, 2, 2);
	// 有参的构造函数接收参数为 -> （起步价，起步里程,每公里价格)

	// 测试
	try {
	    Thread.sleep(10_000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}

	carMeter.stop();

    }

}
