package deadLock;

public class DeadLock {
	static class Friend {
		private final String name;
		public Object lock;

		public Friend(String name) {
			this.lock = new Object();
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public synchronized void bow(Friend bower) {
			System.out.format("%s: %s"
					+ "  has bowed to me!%n",
					this.name, bower.getName());
			bower.bowBack(this);
		}

		public synchronized void bowBack(Friend bower) {
			// 同一时间同一object只能有一个syncchronized 方法执行
			// 中断的sync 方法不算在执行
			// 非sync方法不受限制，
			System.out.format("%s: %s"
					+ " has bowed back to me!%n",
					this.name, bower.getName());
		}

		public synchronized void test() {
			System.out.println("in test");
			try {

				System.out.println("waitting");
				Thread.sleep(3000);
				System.out.println("waited");
				// wait();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("end test");
		}

		public void testNosync() {
			System.out.println("in No Sync");

		}
	}

	public static void main(String[] args) throws InterruptedException {
		Friend alphonse = new Friend("Alphonse");
		Friend gaston = new Friend("Gaston");
		new Thread(new Runnable() {

			@Override
			public void run() {
				alphonse.bow(gaston);
			}
		}).start();
		;
		// Thread.sleep(1000);
		// new Thread(new Runnable() {
		//
		// @Override
		// public void run() {
		// alphonse.test();
		// }
		// }).start();

		// alphonse.notify();
		// new Thread(new Runnable() {
		// public void run() {
		// alphonse.bow(gaston);
		// }
		//// }).start();
		new Thread(new Runnable() {
			public void run() {
				gaston.bow(alphonse);
			}
		}).start();
		Thread.sleep(1000);
		new Thread(new Runnable() {

			@Override
			public void run() {
				alphonse.testNosync();
			}
		}).start();
	}
}
