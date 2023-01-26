package com.interfac;

public interface Interfacespeed {
	
	public void racing();
	public void fly();

}
  

    interface pathan{
	
	
	public void yrf();
	
}

 class Automobile implements  Interfacespeed,pathan{
	 

	@Override
	public void racing() {
		System.out.println("flyingpathan");
		
	}

	@Override
	public void fly() {
		System.out.println("flyingup");
		
		
	}
	
	
	public static void main(String[] args) {
		Automobile automobile = new Automobile();
		automobile.racing();
		automobile.fly();
		automobile.yrf();
	}

	@Override
	public void yrf() {
		System.out.println("blockbuster");
		
	}
	
}