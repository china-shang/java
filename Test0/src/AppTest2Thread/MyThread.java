package AppTest2Thread;

public class MyThread extends Thread {

	private Object lock = new Object();
	private boolean keepRunning;


	public MyThread() {
	}

	public boolean isKeepRunning() {
		return keepRunning;
	}

	@Override
	public void run() {
		super.run();

		while (isKeepRunning()) {
			synchronized (lock) {

				lock.notifyAll();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					// e.printStackTrace();
					System.out.println("catch InterruptedException then return");
					return;
				}
				System.out.println("In my Thread:"
						+ Thread.currentThread().getName());

			}
		}
	}

	public void setKeepRunning(boolean keepRunning) {
		this.keepRunning = keepRunning;
	}

	@Override
	public synchronized void start() {
		// TODO 自动生成的方法存根
		keepRunning = true;
		super.start();
	}

}
