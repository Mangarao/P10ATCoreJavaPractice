package com.deloitte.corejava.training.multithreading;

public class MyUserThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("My thread is running...");
	}
	
	public static void main(String[] args) {
		MyUserThread t1=new MyUserThread();
		t1.start();
	}

}
