package deadLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockSolve {
    public static void main(String[] args) {

	DeadLockSolve solver1 = new DeadLockSolve();
	DeadLockSolve solver2 = new DeadLockSolve();
	new Thread(new Runer(solver1)).start();
	new Thread(new Runer(solver2)).start();

    }

    static class Runer implements Runnable {
	private final DeadLockSolve solver;

	public Runer(DeadLockSolve solver) {
	    this.solver = solver;
	}

	@Override
	public void run() {
	    solver.method();
	}

    }

    private final Lock lock = new ReentrantLock();

    public void method() {

	try {
	    if (lock.tryLock()) {
		System.out.println("I get the lock,"
			+ "now nobody can get lock");
		try {
		    Thread.sleep(400);
		} catch (InterruptedException e) {
		    // TODO 自动生成的 catch 块
		    e.printStackTrace();
		}
	    }
	} finally {
	    lock.unlock();
	    System.out.println("I lost the lock"
		    + "now others can get lock");
	}
    }
}
