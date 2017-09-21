package com.the.AppTest1;

public class TestTemplate<T> {

	private T var;

    public static <T> void testStatic(int a) {
	T test;
		System.out.println("static ");
	}

	public void testStatic() {
		System.out.println("static ");
	}

	public TestTemplate(T args) {
		setVar(args);
		System.out.println(args);
	}

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}

}
