package AppTest2Thread;

public class testThread {

	public static void main(String[] args) throws InterruptedException {

		// by extend Thread
		MyThread myThread = new MyThread();
		myThread.start();

		// by RunnableClass
		MyRunnableClass myRunnableobject = new MyRunnableClass();
		(new Thread(myRunnableobject)).start();

		while (!myThread.isInterrupted()) {
			myThread.interrupt();
		}


		Thread.sleep(4_000);

		myThread.setKeepRunning(false);
		myRunnableobject.setKeepRunning(false);

	}

}
