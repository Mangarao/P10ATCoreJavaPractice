package com.deloitte.corejava.training.oops;
class Bank{
	
	float getRateOfInterest() {
		return 5;
	}
}

class SBI extends Bank{
	@Override
	float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6.5f;
	}
}

class ICICI extends Bank{
	@Override
	float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7.5f;
	}
}

class HDFC extends Bank{
	@Override
	float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8.5f;
	}
}

public class TestBank {

	public static void main(String[] args) {
		
		SBI sbi=new SBI();
		ICICI i=new ICICI();
		HDFC h=new HDFC();
		System.out.println("SBI interest rate is: "+sbi.getRateOfInterest());
		System.out.println("ICICI interest rate is: "+i.getRateOfInterest());
		System.out.println("HDFC interest rate is: "+h.getRateOfInterest());

	}

}
