package com.bptn.course._06_big_coding_challenges;
import java.util.Scanner;
public class StringOperations {
	// ----- Palindrome Check -----
	
	public static boolean isPalindrome(String palindrome) {
		// two pointers at each end of the string
		int l = 0, r = palindrome.length() - 1;
		
		// iterate until l passing r
		while(l <= r) {
			// if they are not the same at any point exit and return false
			if(palindrome.charAt(l) != palindrome.charAt(r)) {
				return false;
			}
			// increment l and decrement r
			l++;
			r--;
		}
		
		// get through the entire word -> return true
		return true;
	}
	
	// ----- Comparison Check -----
	public static boolean comparisonCheck(String first, String second) {
		// storing length of each string in variables
		int firstLen = first.length(), secondLen  = second.length();
		// edge case to check if they are not the same length
		if (firstLen != secondLen){
			return false;
		}
		
		// iterate through each string if they are not equal at any point return false
		for(int i = 0; i < firstLen; i++) {
			
			if (first.charAt(i) != second.charAt(i)){
				return false;
			}
			
		}
	
		
		// if iterated through both words -> no differences -> return true
		return true;
	}

	// ----- Reverse String -----
	public static String reverse(String string) {
		// init new result var
		String reversedString = "";
		// storing length in variable
		int n  = string.length();
		
		// start from end of input string and concat the char to res string
		for(int i = n - 1; i >  - 1; i--) {
			reversedString += string.charAt(i);
		}
		
		return reversedString;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // init scanner object
		boolean contOp = true; // boolean variable to track if users still wants to do operations
		do {
			
			System.out.print("/...String Menu.../\n" +
					"Press 1 for Palindrome Check\n" +
					"Press 2 for reverse a String\n" +
					"Press 3 for Concatenate two Strings\n" +
					"Press 4 for String Comparison\n" +
					"Press 5 to Calculate the Length of String\n" +
					"Press 6 to Exit Menu\n" +
					"Enter the option: ");
			
			int menuOption = scanner.nextInt(); // user option
			scanner.nextLine(); // clearing line to get input on next line
			
			switch(menuOption) {
			case 1:
				System.out.println("Palindrome Check");
				System.out.println("Enter a String: ");
				String palindrome = scanner.nextLine();
				// ternary statement that calls palindrome check function
				// creates an empty string variable or string = "not "
				// palindrome check == false -> string is "not" a palindrome
				String notPal = isPalindrome(palindrome) ? "" : "not ";
				
				System.out.println(palindrome + " is " + notPal + "a palindrome");
				
				
				
				
				break;
			case 2:
				// ask user to input string to reverse
				System.out.println("Enter String: ");
				String toReverse = scanner.nextLine();
				// print the string reverse using reverse method
				System.out.println(reverse(toReverse));
				break;
			case 3:
				// ask user to input two strings
				System.out.println("Enter First String:");
				String firstCon = scanner.nextLine();
				System.out.println("Enter Second String:");
				String secondCon = scanner.nextLine();
				// concat the two strings
				System.out.println(firstCon + secondCon);
				break;
			case 4:
				// asking for user input for two strings
				System.out.println("String Comparison");
				System.out.println("Enter First String: ");
				String firstCheck  = scanner.nextLine();
				System.out.println("Enter Second String: ");
				String secondCheck = scanner.nextLine();
				// ternary operator that if comparisonCheck metho is true -> empty string, false -> "not"
				String notEqual = comparisonCheck(firstCheck, secondCheck) ? "" : "not ";
				
				System.out.println("The entered strings are " + notEqual + "equal");
				break;
			case 5:
				System.out.println("Length of a string");
				System.out.println("Enter a string:");
				String getLen = scanner.nextLine();
				
				System.out.println("The length of the entered string is: " + getLen.length());
				break;
			case 6:
				// user choses 6 then boolean is false so program can exit
				contOp = false;
				break;
			default:
				System.out.println("Invalid choice! Please make a valid choice.");
				
			}
			
			
		}while(contOp);
		
		 scanner.close();
	    
	}

}
