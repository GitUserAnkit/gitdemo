package com.ankit.design.pattern;

import java.util.concurrent.locks.ReentrantLock;

class Singleton {
	private static Singleton instance = null;
	private static final ReentrantLock LOCK = new ReentrantLock();

	private Singleton() {
		System.out.println("singleton private method executed successfully");
	}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			LOCK.lock();
			try {
				if (instance == null) {
					instance = new Singleton();
					System.out.println(instance.getClass().getName());
				}
			} finally {
				LOCK.unlock();
			}

		}
		return instance;
	}
}

public class SingletonReentrantLockExample {
	public static void main(String[] args) {

		Singleton.getInstance();
		Singleton.getInstance();
	}

}
