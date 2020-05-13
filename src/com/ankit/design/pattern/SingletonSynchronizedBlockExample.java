package com.ankit.design.pattern;

class Singleton2 {
	private static Singleton2 instance;

	private Singleton2() {
		System.out.println("singleton executed");
	}

	public static Singleton2 getInstance() {
		if (instance == null) {
			synchronized (Singleton2.class) {
				if (instance == null) {
					instance = new Singleton2();
				}
				return instance;
			}
		}
		return instance;
	}

}

public class SingletonSynchronizedBlockExample {
	public static void main(String[] args) {
		Singleton2.getInstance();
		Singleton2.getInstance();
	}

}
