package com.gmail.the.CarMeter;

//实现计费器
public class CarMeter extends CarMeterAbstract implements UserControl, CarSimulator {
    class IncreaseMileage extends Thread {
	@Override
	// 每秒mileage++
	public void run() {
	    super.run();
	    while (keepRunning) {
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		// TODO
		synchronized (lockIncreaseMileage) {
		    mileage++;
		}

	    }

	}

    }

    class MonitorThread extends Thread {
	@Override
	public void run() {
	    // 每秒检查一次里程数
	    super.run();
	    while (keepRunning) {
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		// TODO cal Price

		synchronized (lockMonitor) {

		    // price = mileage * perMilePrice;

		    // if (price <= startingPrice) {
		    // price = startingPrice;
		    // }
		    if (mileage <= startingMileage) {
			price = startingPrice;
		    } else {
			price = (mileage - 2) * perMilePrice + startingPrice;
		    }
		}

		output();
	    }
	}

    }

    private boolean keepRunning = false;

    // 监控及模拟汽车行驶线程
    private IncreaseMileage increaseThead;
    private MonitorThread monitorThread;

    // 线程锁
    private Object lockIncreaseMileage = new Object();
    private Object lockMonitor = new Object();

    public CarMeter() {
	super();
    }

    public CarMeter(float startingPrice, float perMilePrice) {
	super(startingPrice, perMilePrice);
    }

    public CarMeter(float startingPrice, float startingMileage, float perMilePrice) {
	super(startingPrice, startingMileage, perMilePrice);

    }

    // 开始计费
    // --由于并不是在真正的汽车上运行，开启一个线程依据时间自动增加里程，模拟汽车行驶
    // 随后开启监听汽车行驶路程的线程，并输出
    @Override
    public void start() {
	if (!keepRunning) {
	    System.out.format("StartPrice:￥%.1f\tPerMileage:￥%.1f\n", startingPrice, perMilePrice);
	    keepRunning = true;
	    increaseMileage();
	    startMonitor();
	}

    }

    // 停止计费
    @Override
    public void stop() {
	keepRunning = false;

    }

    // 开始监听汽车行驶
    private void startMonitor() {
	monitorThread = new MonitorThread();
	monitorThread.start();

    }

    // 输出数据
    private void output() {
	// XXX output to screen
	System.out.format("Mileage:%.1fkm\tPrice:￥%.1f\n", mileage, price);
    }

    @Override
    public void increaseMileage() {
	increaseThead = new IncreaseMileage();
	increaseThead.start();

    }
}
