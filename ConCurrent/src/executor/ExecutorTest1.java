package executor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorTest1 {

    public static void main(String[] args)
	    throws InterruptedException, ExecutionException {

	ExecutorService pool = Executors.newFixedThreadPool(8);
	ExecutorService pool1 = Executors.newCachedThreadPool();

	// submit(Runnable task,T result) result参数为返回future的结果
	// submit(Runnable task) 返回future只代表task的运行情况
	Future<String> fut1 = pool.submit(() -> {
	    ;// doNothing
	}, "hello");

	System.out.println("the runnable'result=" + fut1.get());

	Future<?> fut2 = pool.submit(() -> {
	    ;// doNothing
	});
	System.out.println(fut2.isDone());

	pool.submit(() -> {
	    System.out.println("this runnable\n");
	});

	Future<Integer> future = pool1.submit(
		() -> {
		    System.out.println("this callable");
		    try {
			System.out.println("start sleep");
			Thread.sleep(1000);
		    } catch (InterruptedException e) {
			e.printStackTrace();
		    }
		    return 11;
		});

	Integer result;
	try {
	    result = future.get();
	} catch (InterruptedException | ExecutionException e) {
	    e.printStackTrace();
	    result = 0;
	}
	System.out.println("result=" + result);

	ArrayList<Callable<Integer>> test = new ArrayList<Callable<Integer>>();
	HashSet<String> testSet = new HashSet<>();

	testSet.add("hello");
	testSet.add("world");
	String[] str = testSet.toArray(new String[0]);



	for (String string : str) {
	    System.out.println(string);
	}

	test.stream().forEach(e -> pool.submit(e));
	test.add(() -> {
	    System.out.println("this in collect");
	    return 1;
	});
	test.add(() -> {
	    System.out.println("this in collect)");
	    return 1;
	});

	List<Future<Integer>> list = pool.invokeAll(test);

	list.stream().forEach(e -> {
	    try {
		e.get();
	    } catch (InterruptedException | ExecutionException e1) {
		// TODO 自动生成的 catch 块
		e1.printStackTrace();
	    }
	});



	pool.shutdown();
	pool1.shutdown();

    }

}
