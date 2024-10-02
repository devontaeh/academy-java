package com.bptn.course.pratice._w2_wed_self_led;

public class Employee extends PersonIC {

	   private int id;

	   public Employee(String theName, int id) {
	      super(theName);
	      this.id = id;
	   }

	   public int getId() {
	      return id;
	   }
	  

	   public static void main(String[] args) {
	      
	      Employee emp = new Employee("Dani", 10);
	      System.out.println(emp.getName());
	      System.out.println(emp.getId());

	      //use the getter methods and print the name & id of the emp object
	   }
	}

