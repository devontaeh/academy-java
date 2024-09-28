package com.bptn.course._06_big_coding_challenges;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// setting target
		int targetNumber = 23;
		// what user will guess
		int guess;
		
		// bool to track if user continues to guess
		boolean correct = false;
		
		Scanner scanner = new Scanner(System.in);
		// while user hasn't guessed correct keep looping
		do {
			System.out.println("Guess a number between 1 and 100.");
			
			guess = scanner.nextInt();
			// if out of bounds
			if(guess > 100 || guess < 1) {
				System.out.println("Please enter a number between 1 and 100.");
			}else if(guess > targetNumber) {
				// too high
				System.out.println("Too high! Try again.");
			}else if(guess < targetNumber) {
				// too low
				System.out.println("Too Low! Try again");
			}else {
				// correct guess, change correct to true to exit loop
				System.out.println("Congratulations! You guessed the number correctly!");
				correct = true;
				
			}
			
		}while(!correct); // keep loop while correct = false
		
		scanner.close();
		
		
		

	}

}
