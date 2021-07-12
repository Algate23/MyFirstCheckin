package com.qa.tests;

public class Actpgm {
	public static void browser(String name) {
		if(name=="chrome") {
			System.out.println("Launch chrome");
			
		}else if (name=="fire") {
			System.out.println("Launch fire");
		}else {
			System.out.println("Launch safari");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		browser("safari");

	}

}
