package com.streams.byjohnpurcell;

import java.util.stream.IntStream;

public class StreamReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Reduce streams into a single value.
		 */
		
		var value = IntStream.range(0, 10).reduce(0,(subtotal,item)->{
			System.out.println(subtotal + ": " + item);
			return subtotal + item;

		});
	}

}
