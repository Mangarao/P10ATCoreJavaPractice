package com.deloitte.corejava.training.exceptions;

public class FinalizeEx extends Object{
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize is called");
	}
	
	public static void main(String[] args) {
		new FinalizeEx();
		new FinalizeEx();
		
		System.gc();
	}

}
