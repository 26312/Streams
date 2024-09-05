package com.streams.exercises;

import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class StreamExercise2 {

	public static void main(String[] args) {
		/**
		 * factorial
		 * 4! = 4 * 3 * 2 * 1
		 * 5! = 5 * 4 * 3 * 2 * 1
		 * 6! = 6* 5 * 4 * 3 * 2 * 1
		 * 
		 * Print factorial of numbers using IntStream and reduce
		 */
		
		/**
		 *  First approach is by using rangeClosed()method
		 */
		int solution = IntStream.rangeClosed(1, 5).reduce(1,(fact,n)->{ 
			//System.out.println(fact + ":" + n);
			return fact * n ;
		}); 		
		System.out.println("Using rangeClosed() method: "+ solution);
			
			
		int factorial = IntStream.range(1, 5).reduce(1,(number1,number2)-> number1 * number2);
		System.out.println("Using range() method: "+factorial);
	
		
		
		
		
		
		
	
	}
	
	

}
