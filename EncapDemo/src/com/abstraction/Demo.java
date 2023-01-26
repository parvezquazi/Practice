package com.abstraction;

abstract class moped{
	
	abstract void roadRun();

}



class Suzuki extends moped{
@Override
	void roadRun() {System.out.println("smoothride");
	}
	public static void main(String[] args) {
		
		Suzuki suzuki = new Suzuki();	
		suzuki.roadRun();
		
	}

	}
	
	
	
