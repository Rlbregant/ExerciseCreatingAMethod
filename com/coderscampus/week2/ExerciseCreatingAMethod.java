package com.coderscampus.week2;

import java.util.Scanner;

public class ExerciseCreatingAMethod {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Enter a number from 50 to 300.");
		
			String input = scanner.nextLine();

			Integer convertedInput = Integer.parseInt(input);
    
    

			if (convertedInput < 50) {
				System.out.println("No!");
			} else if (convertedInput > 300) {
				System.out.println("No!");
			} else  {
				System.out.println("Yes!");
			}
        
		
			scanner.close();
			

				Question number = new Question();

			System.out.println("The number you typed in was: " +  number);

			
 }
}		
