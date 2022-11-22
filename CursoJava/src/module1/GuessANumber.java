package module1;

import java.util.Scanner;

public class GuessANumber {

	public static void guessingNumberGame() {

	     Scanner sc = new Scanner(System.in);
	 
	     // Generate a random number between 0 and 100
	     int number = (int)(101* Math.random());
	 
	     // Given K trials
	     int K = 50;
	     int tries = 0;
	     
	     int i, guess;
	 
	     System.out.println(
	            "Guess a number between 0 and 100");
	 
	        // Iterate over K Trials
	     for (i = 0; i < K; i++) {
	 
	         System.out.println("Guess the number:");
	 
	            // Take input for guessing
	         guess = sc.nextInt();
	         tries++;
	            // If the number is guessed
	         if (number == guess) {
	        	 
	                System.out.println(
	                    "Congratulations! You guessed the number in " + tries + " tries.");
	             break;
	            }
	            else if (number > guess
	                     && i != K - 1) {
	            	
	                System.out.println(
	                    "The number is greater than " + guess);
	            }
	            else if (number < guess
	                     && i != K - 1) {
	            	
	                System.out.println(
	                    "The number is less than " + guess);
	            }
	        }
	 
	        if (i == K) {
	            System.out.println(
	                "You are really stupid, and wasted " + K + " tries");
	 
	            System.out.println(
	                "The number was " + number);
	        }
	    }
	 
	    // Driver Code
	    public static void
	    main(String arg[])
	    {
	 
	        // Function Call
	        guessingNumberGame();
	    }
}
