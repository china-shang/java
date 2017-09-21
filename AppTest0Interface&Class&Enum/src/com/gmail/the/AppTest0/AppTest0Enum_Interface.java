package com.gmail.the.AppTest0;

class AppTest0Enum_Interface {

    public static void main(String[] args) {

	// test class
	TestClass testObject = new TestClass("hello");
	testObject.test1("test1");
	testObject.test2("test1");
	Object object = new Object();

	boolean is = TestClass.class.isAssignableFrom(Object.class);
	if (is) {
	    System.out.println("TestClass是Object的子类");
	} else {
	    System.out.println("TestClass不是Object的子类");

	}
	boolean isInst = Object.class.isInstance(testObject);
	if (isInst) {
	    System.out.println("testobject是Object的对象");
	} else {
	    System.out.println("testobject不是Object的对象");

	}
	// 所有对象都是Object的对象
	// 但并不是所有的类都是Object的子类

	System.out.println("object=" + testObject);

	// static method
	TestClass.test("static");
	// warnning when use object call static method
	testObject.test("jfij");

	// getter
	String string1 = testObject.getString();
	System.out.println(string1);

	// setter
	testObject.setString("new string");
	string1 = testObject.getString();
	System.out.println(string1);

	// test enum
	EnumTest test3 = EnumTest.TEST1;
	if (test3 == EnumTest.TEST1) {
	    System.out.println("test3 is EnumTest");
	} else {

	    System.out.println("test3 is EnumTest");
	}
    }

}