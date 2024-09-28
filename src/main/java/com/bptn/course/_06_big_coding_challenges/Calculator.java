package com.bptn.course._06_big_coding_challenges;

import java.util.*;
import java.lang.Math;

public class Calculator {
	// -----STATIC METHOD TO RETURN DOUBLE------
	
	// -----ADDING TOGETHER a + b------
    public static double addition(double a, double b){
      return a + b;

    }
    // -----SUBTRACTING a - b -----
    public static double subtraction(double a, double b){
      return a - b;
    }
    // -----MULTIPLY a * b  -----
    public static double multiplication(double a, double b){
      return a * b;
    }
    // -----TAKING THE FLOOR VALUE OF a / b -----
    public static double division(double a, double b){
    	return Math.floor(a/b);
    }
    // ----- a MOD b -----
    public static double remainder(double a, double b){
    	return a % b;
    }
    
    
    // -----a ^ 2 -----
    public static double square(double a){
      return Math.pow(a, 2.0);
    }
    
    // ----- a ^ (1/2) -----
    public static double squareRoot(double a){
      return Math.pow(a, 0.5);
    }
    
    
    // ----- 1 DIVIDED By a -----
    public static double reciprocal(double a){
      return 1 / a;
    }


    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in); // init scanner object
      int contCalc = 0; // variable to track if users wants to continue calculations
      do {
    	  // printing out menu
    	  System.out.print("/...Calculator Menu.../\n" +
    			  "Press 1 for addition\n" +
    			  "Press 2 for subtraction\n" +
    			  "Press 3 for multiplication\n" +
    			  "Press 4 for division\n" +
    			  "Press 5 to square a number\n" +
    			  "Press 6 to find a square root\n" +
    			  "Press 7 to find the reciprocal\n" + 
    			  "Chose A Menu Option: ");
    	  
    	  int menuOption = scanner.nextInt(); // user selection
    	  
    	  // switch statement where each case corresponds to menu option
    	  switch(menuOption){
    	  case 1: // addition
    		  //asking user to enter two numbers
    		  System.out.print("Enter the first number: ");
    		  double add1 = scanner.nextDouble();
    		  System.out.print("Enter the second number: ");
    		  double add2 = scanner.nextDouble();
    		  // storing return into sum variable
    		  double sum = addition(add1, add2);
    		  System.out.println("The sum of the numbers " + add1 + " and " + add2 + " is = " + sum);
    		  break;
    		  
    	  case 2: //subtraction
    		  //asking user to enter two numbers
    		  System.out.print("Enter the first number: ");
    		  double sub1 = scanner.nextDouble();
    		  System.out.print("Enter the second number: ");
    		  double sub2 = scanner.nextDouble();
    		  // storing return into diff variable
    		  double diff = subtraction(sub1, sub2);
    		  System.out.println("The diff of the numbers " + sub1 + " and " + sub2 + " is = " + diff);
    		  break;
    	  case 3: //multiplication
    		  //asking user to enter two numbers
    		  System.out.print("Enter the first number: ");
    		  double multi1 = scanner.nextDouble();
    		  System.out.print("Enter the second number: ");
    		  double multi2 = scanner.nextDouble();
    		  // storing return into product variable
    		  double product = multiplication(multi1, multi2);
    		  System.out.println("The product of the numbers " + multi1 + " and " + multi2 + " is = " + product);
    		  break;
    		  
    	  case 4: //division + remainder
    		  // asking user to enter numerator and denominator
    		  System.out.print("Enter the numerator: ");
    		  double numerator = scanner.nextDouble();
    		  System.out.print("Enter the denominator: ");
    		  double denominator = scanner.nextDouble();
    		  // storing return from remainder and division method and storing in variable
    		  double remainder = remainder(numerator, denominator);
    		  double quotient = division(numerator, denominator);
    		  
    		  System.out.println("Dividing " + numerator + " by " + denominator + " the quotient is " + quotient);
    		  System.out.println("The remainder is " + remainder);
    		  break;
    		  
    	  case 5: // square
    		  // asking user to enter the number to square
    		  System.out.print("Enter the number to find Square: ");
    		  double num = scanner.nextDouble();
    		  
    		  System.out.println("The square of the number " + num + " is = " + square(num));
    		  break;
    		  
    	  case 6: // square root
    		  System.out.print("Enter the number to find Square: ");
    		  double sqrt = scanner.nextDouble();
    		  System.out.println("The square root of the number " + sqrt + " is = " + squareRoot(sqrt));
    		  break;
    		  
    	  case 7: // reciprocal
    		  System.out.print("Enter the number to find the reciprocal: ");
    		  double recip = scanner.nextDouble();
    		  System.out.println("The recicrocal of the number " + recip + " is = " + reciprocal(recip));
    		  break;
    		  
    	  default: // default case if user doesn't input num from 1-7
    		  System.out.println("Invalid choice! Please make a valid choice.");
    		  // auto changing so user can re enter new choice
    		  contCalc = 1;
    		    
    	  }
    	  // asking if user wants to continue calculations
    	  System.out.println("To continue calculation Press 1, else press any other number to exit");
    	  contCalc = scanner.nextInt();
      }while(contCalc == 1);
      
      scanner.close();


        
    }
}