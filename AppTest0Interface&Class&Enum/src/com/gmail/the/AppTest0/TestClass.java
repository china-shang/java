package com.gmail.the.AppTest0;

public class TestClass implements InterfaceTest1 {

    private String string;
    private Integer num;

    public String getString() {
	return string;
    }

    public void setString(String string) {
	this.string = string;
    }

    public TestClass(String string, int num) {
	this.num = num;
	this.setString(string);

	System.out.println("string:" + string);
	System.out.println("In TestClass's TestClass");
    }

    public TestClass(String string) {
	this.setString(string);

	System.out.println("string:" + string);
	System.out.println("In TestClass's TestClass");
    }

    @Override
    public void test1(String arg) {
	System.out.println("In TestClass's test1");

    }

    @Override
    public void test2(String arg) {
	System.out.println("In TestClass's test2");

    }

    public static void test() {

	System.out.println("In TestClass's static test");
    }
    public static void test(String arg) {

	System.out.println("In TestClass's static test");
    }

}
