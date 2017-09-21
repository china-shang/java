package AppTest2Thread;

public class MyRunnableClass implements Runnable {

	private Object lock = new Object();
	private boolean keepRunning = true;

	public MyRunnableClass() {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void run() {
		while (isKeepRunning()) {
			synchronized (lock) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println("In MyRunnableObject"
						+ Thread.currentThread().getName());
			}

		}

	}

	public boolean isKeepRunning() {
		return keepRunning;
	}

	public void setKeepRunning(boolean keepRunning) {
		this.keepRunning = keepRunning;
	}

}
