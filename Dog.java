package com.syntax.class12.HW.ClassesAndObjects;

public class Dog {
	
	String breed;
	char gender;
	int age;
	
	void run() {
		System.out.println(breed+" which is "+age+" years old run fast");
	}
	void eat() {
		System.out.println(breed+" eat a lot of dog food");
	}

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.breed="Husky";
		dog1.gender='F';
		dog1.age=5;
		
		dog1.run();
		dog1.eat();
		
		Dog dog2=new Dog();
		dog2.breed="Bulldog";
		dog2.gender='M';
		dog2.age=2;
		
		dog2.run();
		dog2.eat();
		
		
		
		Dog dog3=new Dog();
		dog3.breed="Labrador";
		dog3.gender='F';
		dog3.age=9;
		
		dog3.run();
		dog3.eat();

	}

}
