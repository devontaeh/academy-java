package com.bptn.course.pratice._w2_wed_self_led;

//Complete building up this class
public class APStudent extends Student {

private double apScore;

public APStudent(String name, int id, double apScore){
 super(name, id);
 
 this.apScore = apScore;

}

public String toString(){
 return super.toString() + " " + apScore;
}



}
