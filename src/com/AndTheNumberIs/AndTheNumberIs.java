package com.AndTheNumberIs;

import java.util.Scanner;
import java.util.Random;

public class AndTheNumberIs {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		int guessMe = random.nextInt(100)+1;
		for(int i = 0; i < 1 ; i = i + 1) {
//			System.out.println("random number is " + guessMe);
		}
			System.out.println("Pick a number between 1 and 100.");
		Scanner scanner = new Scanner(System.in);
		Integer input = scanner.nextInt();
		
		while (input < 0 | input > 100) {
			System.out.println("You're guess is not between 1 and 100, please try again");
			input = scanner.nextInt();}
		
		int maxGuess = 4;
		
		for (int guessChance = 1; guessChance < maxGuess; guessChance++) {	
		if (input == guessMe) {
			System.out.println("You win!");
			break;
		}else{
		 while (input != guessMe) {
			if(input > guessMe) {
				System.out.println("Please pick a lower number");
		}else { if(input < guessMe)
				System.out.println ("Please pick a higher number");
				}
			input = scanner.nextInt();
		 }
		 if(guessChance == maxGuess)	
			System.out.println("You lose!"); 
			System.out.println("The number to guess was: " + guessMe);}
		scanner.close();
		
		}
	}
}



