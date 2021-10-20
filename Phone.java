package com.syntax.class12.HW.ClassesAndObjects;

public class Phone {
	
	String name;
	String color;
	double memory;
	
	void pictures() {
		System.out.println(name+" takes great pictures");
	}
	void sleepMode() {
		System.out.println(name+" has a sleep mode");
	}
	

	public static void main(String[] args) {
	

		Phone phone1=new Phone();
		phone1.name="Iphone";
		phone1.color="pink";
		phone1.memory=252;
		
		phone1.pictures();
		phone1.sleepMode();
		
		
		Phone phone2=new Phone();
		phone2.name="Android";
		phone2.color="black";
		phone2.memory=1;
		
		phone2.pictures();
		phone2.sleepMode();
		
		
		Phone phone3=new Phone();
		phone3.name="Nokia";
		phone3.color="silver";
		phone3.memory=612;
		
		phone3.pictures();
		phone3.sleepMode();
	}

}
