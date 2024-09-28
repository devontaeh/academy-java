package com.bptn.course._06_big_coding_challenges;
import java.util.Scanner;
public class WordEncryption {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// ask user to input string
		System.out.print("Enter String: ");
		
		String input = scanner.nextLine();
		
		//create string builder object of input string
		StringBuilder resString = new StringBuilder(input);
		int n = resString.length(); // store length in var
		char cur; // variable to hold curren var in string
		
		for(int i = 0; i < n; i++) {
			cur = resString.charAt(i); // set cur to char at i
			
			// if none numerical -> skip to next iteration
			if((cur > 90 && cur < 97) || (cur > 122) || (cur < 65) ) {
				continue;
			}
			
			// checking if lowercase or capital z else -> increase by 1
			if(cur == 90) {
				cur = 65;
			}else if(cur == 122) {
				cur = 97;
			}else {
				cur++;
			}
			resString.setCharAt(i, cur); // set the char to updated char
		}
		
		System.out.println("Encrypted word: " + resString);
		
		scanner.close();

	}

}
