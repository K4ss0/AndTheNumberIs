package com.AndTheNumberIs;

import java.util.Scanner;
import java.util.Random;

public class AndTheNumberIs {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		int guessMe = random.nextInt(100)+1;
		 
//			System.out.println("random number is " + guessMe);
		
		System.out.println("Pick a number between 1 and 100.");
		Scanner scanner = new Scanner(System.in);
		int maxGuess = 5;
		int remainingGuesses = maxGuess;
		
		
		while (remainingGuesses > 0) {
			int input = scanner.nextInt();
			
			if(input < 1 || input > 100) {
			System.out.println("You're guess is not between 1 and 100, please try again");
			continue;
		}
		
			
		if (input == guessMe) {
			System.out.println("You win!");
			scanner.close();
			return;
		}else if(input > guessMe) {
				System.out.println("Please pick a lower number");
		}else if(input < guessMe) {
				System.out.println ("Please pick a higher number");
		}
		remainingGuesses--;
	}
	System.out.println("You lose!"); 
	System.out.println("The number to guess was: " + guessMe);
	scanner.close();
}
}


