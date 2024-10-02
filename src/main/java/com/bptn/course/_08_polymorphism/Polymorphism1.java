package com.bptn.course._08_polymorphism;

//Parent class
class Animal{
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//sub class
class Dog extends Animal{
	// has its own methods
	@Override
	void makeSound() {
		System.out.println("Dog barks");
		
	}
	
}

public class Polymorphism1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.makeSound();
		
		//create object from dog class
		Dog d1  = new Dog();
		d1.makeSound();
		

	}

}
