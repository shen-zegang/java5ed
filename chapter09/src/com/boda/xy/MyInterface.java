package com.boda.xy;

public interface MyInterface {
	static private  void init2() {
		IO.println("静态私有方法");
	}
	
	public static void m() {
		init2();
	}
	private void init() {
		IO.println("完成某些初始化操作");
	}

	void normalInterfaceMethod();

	default void defaultMethod() {
		init();
		init2();
	}

	default void anotherDefaultMethod() {
		init();
	}
	
}
