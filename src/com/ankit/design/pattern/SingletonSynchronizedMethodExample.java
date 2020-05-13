package com.ankit.design.pattern;



class Singleton1{
	private static Singleton1 instance=null;
	private Singleton1(){
		System.out.println("singleton executed successfully");
	}
	public static synchronized Singleton1 getInstance(){
		if(instance==null){
			instance=new Singleton1();
		}
		return instance;
	}
}
public class SingletonSynchronizedMethodExample {
	public static void main(String[] args) {
		Singleton1.getInstance();
		Singleton1.getInstance();
		
	}

}
