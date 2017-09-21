package com.the.AppTest1;

public class AppTest1Lamada_Template {

	public AppTest1Lamada_Template() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		// test Template
		TestTemplate<String> temp = new TestTemplate<String>("hello Template");

		// test Template's getter
		String var = temp.getVar();
		System.out.println(var);

		// test Lambda
		// System.out.println(testUseLambda(() -> "use lambda"));
		String b = testUseLambda(a -> a, "test lambda");
		System.out.println(b);

		try {
			while (true) {
				;
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println("end");

	}

	// T并没有显示指示出来，可能由testUseLambda参数推断的
	public static <T> String testUseLambda(OnlyOne<T> interfaceTest, T arg) {
		return interfaceTest.method(arg);

	}

}
