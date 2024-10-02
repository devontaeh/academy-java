package com.bptn.course.pratice._w2_wed_self_led;

class PersonIC {
	   private String name;

	   public PersonIC(String theName) {
	      this.name = theName;
	   }

	   public String getName() {
	      return name;
	   }

	   public boolean setName(String theNewName) {
	      if (theNewName != null) {
	         this.name = theNewName;
	         return true;
	      }
	      return false;
	   }
	}
