package com.deloitte.corejava.training.multithreading;

public class MyTestClass {
	
	public static void main(String[] args) throws InterruptedException {
	Thread t1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Thread is running.");
			
		}
	});
	
	t1.start();
	t1.start();
	}

}
