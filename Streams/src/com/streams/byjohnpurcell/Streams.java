package com.streams.byjohnpurcell;
/**
 * Section 30: Streams
 * Videos 375: Streams
 */
import java.util.ArrayList;
import java.util.List;


public class Streams {

	public static void main(String[] args) {

		/**
		 * Stream API is used for processing sequences of elements, providing
		 * a high-level abstraction for operations on Collections
		 */
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6));
		numbers.stream().forEach(n->{
			System.out.println("Stream values from ArrayList: "+n);
		});
		

	}

}
