package test0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
	HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	hashMap.put(1, 1);
	hashMap.put(2, 2);
	hashMap.put(3, 3);
	Collection<Integer> a = hashMap.values();

	Set<Entry<Integer, Integer>> b = hashMap.entrySet();
	// entrySet() 返回内部set；
	for (Entry<Integer, Integer> entry : b) {
	    System.out.println(entry);
	}

	ArrayList<Integer> array = new ArrayList<Integer>();
	array.add(21);
	array.add(21);
	array.add(0, 0);

	for (Integer integer : array) {
	    System.out.println(integer);

	}
	HashSet<Integer> hashSet = new HashSet<>();
	hashSet.add(23);
	hashSet.add(3);
	hashSet.add(23);
	System.out.println(hashSet);
	for (Integer integer : hashSet) {
	    System.out.println(integer);

	}

	LinkedList<Integer> linkList = new LinkedList<>();
	linkList.add(2);
	linkList.add(3);
	linkList.removeLast();
	for (int integer : linkList) {
	    System.out.println(integer);

	}

	Deque<Integer> deque = linkList;
	// LIFO
	System.out.println("use Deque");
	deque.push(121);
	System.out.println(deque);
	deque.pop();
	System.out.println(deque);

	Queue<Integer> queue = linkList;
	// FIFO
	System.out.println("use Queue");
	queue.offer(23);
	System.out.println(queue);
	queue.poll();
	System.out.println(queue);
	queue.offer(123);

	// advance
	System.out.println("print use stream");

	ArrayList<? super Integer> testSuper = new ArrayList<>();
	testSuper.add(243);
	Object res = testSuper.get(0);
	testSuper.size();

	ArrayList<? extends Integer> testExtends = new ArrayList<>(3);
	testExtends.size();
	// Integer res1 = testExtends.get(0);
	// testExtends.add(243);//error

	// <? super T> 只能put，不能get
	// T 为下界
	// 限制下界可放

	// <? extend T> 只能get，不能put
	// T 为上界
	// 限制上界可取
	/*
	 * o
	 * O
	 * 大于等于上界才能取
	 * 
	 * O
	 * o
	 * 小于等于下界才能放
	 */

	// ?super ?extends 对其他操作无影响

	// <?> 为用占位符代表某一类
	// 所以<?>不能put不能get

	// <?>存在的意义
	// 不能存取，但其他一些操作不受影响

	// 使用object进行存取不受限制
	queue.stream()
		.filter(e -> e > 0)
		.forEach(e -> System.out.println(e));
	queue.stream()
		.map((e) -> e * 100)
		.forEach(e -> System.out.println(e));

	System.out.println("use collect");
	List<Integer> list1 = Arrays.asList(21, 123, 23);
	Map<Integer, Integer> map = list1.stream()
		.collect(Collectors.toMap(e -> e + 1, e -> e - 1));
	map.forEach((x, y) -> {
	    System.out.format("%d:%d\n", x, y);
	});

    }
}
