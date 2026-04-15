package com.boda.xy;

class Door implements AutoCloseable {
	public Door() {
		System.out.println("The door is created.");
	}

	public void open() throws Exception {
		System.out.println("The door is opened.");
		throw new Exception(); // 模拟发生了异常
	}

	@Override
	public void close() {
		System.out.println("门被关闭。");
	}
}

class Window implements AutoCloseable {
	public Window() {
		System.out.println("The window is created.");
	}

	public void open() throws Exception {
		System.out.println("The window is opened.");		
		throw new Exception(); // 模拟发生了异常
		
	}

	@Override
	public void close() {
		System.out.println("窗被关闭。");
	}
}

public class TryWithResources {
	public static void main(String[] args) throws Exception {
		try (Door door = new Door(); 
				Window window = new Window()) {
			door.open();
			window.open();
		} catch (Exception e) {
			System.out.println("There is an exception.");
		} finally {
			System.out.println("The door and the window are all closed.");
		}
	}
}
