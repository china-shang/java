/**
 * 
 */
package com.gmail.the.test1;

import java.util.LinkedList;

/**
 * @author zh
 *
 */
public class Monkey {

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(select(3));

    }

    public static int select(int total) {
	LinkedList<Integer> l = new LinkedList<>();
	for (int i = 1; i <= total; i++) {
	    l.add(i);
	}

	int i = 1, index = 0;
	while (l.size() > 1) {
	    if (i == 0) {
		l.remove(index);
		index = (index - 1) % l.size();
	    }
	    i = (i + 1) % 3;
	    index = (index + 1) % l.size();
	}

	return l.poll();
    }

}
