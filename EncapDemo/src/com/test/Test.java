package com.test;

import java.util.Scanner;

public class Test {
	
	
	public static void input() {
		
		System.out.println("Enter the name");
		Scanner sc = new Scanner(System.in);
		
		String Name= sc.next();
		

		System.out.println("Enter the rollNo");

		int rollNo = sc.nextInt();
		
		

		System.out.println("Enter the address");
		
		String address = sc.next();
	
		System.out.println();
		
		
		Student s = new Student();
		s.setName(Name);
		s.setRollNo(rollNo);
		s.setAddress(address);
		
        System.out.println("student Name" + s.getName());		
        System.out.println("student rollNo" + s.getRollNo());
        System.out.println("student address " + s.getAddress());
        
	}
	
	public static void main(String[] args) {
	
		
		Test test = new Test();
		test.input();
	
	}

	

}
