package com.bptn.course._06_big_coding_challenges;
import java.util.Scanner;
public class PluralForm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// asking user inputs
		System.out.println("Enter an amount: ");
		int amt = scanner.nextInt();
		System.out.println("Enter a noun: ");
		scanner.nextLine();
		String word = scanner.nextLine();
		// storing length of word
		int n = word.length();
		
		// storying postfix variable to determine how to modify
		String postFix = "" + word.charAt(n -2) + word.charAt(n -1);
		// creating string buffer of new word
		StringBuffer result = new StringBuffer(word);
		
		
		if(amt == 1 ) { // if amt is one -> print the following
			System.out.println(amt + " " + word);
		}else {
			//using a switch statement for readability
			// doing string operations depending on what the word postfix matches
			switch(postFix) {
			case "fe": // if fe -> replace 
				result.replace(n-2, n, "ves");
				break;
			// if either sh or ch -> append
			case "sh":
			case "ch":
				result.append("es");
				break;
			case "us": // if us -> replace
				result.replace(n-2, n, "i");
				break;
			// if aeou + y -> append s
			case "ay":
			case "oy":
			case "ey":
			case "uy":
				result.append("s");
				break;
			default:
				// using regex for matching
				// if ends in word.charAt(n-2) != (a/e/o/u) and word.charAt(n -1) == y -> replace with ies
				if(word.matches(".*[^aeou]y$")) {
					result.replace(n-1, n, "ies");
					
				}else{
					// all other cases append s to word
					result.append("s");
				}
				break;
				
				
			}
			System.out.println(amt + " " + result);
		}
		
		scanner.close();
	
		
		
		
		
		

	}

}
