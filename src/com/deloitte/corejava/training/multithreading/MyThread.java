package com.deloitte.corejava.training.multithreading;

public class MyThread extends Exception implements Runnable  {
	
	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName()+" "+i);	
		}
		
	}
	
	public static void main(String[] args) {
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		Thread t1=new Thread(m1);
		
		t1.setName("Bahubali1");
		Thread t2=new Thread(m2);
		t2.setName("Bahubali2");
		System.out.println(t2.getPriority());
		System.out.println(t1.getState());
		t1.run();
		t2.run();
	}

}
