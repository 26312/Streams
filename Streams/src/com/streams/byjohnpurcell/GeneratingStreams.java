package com.streams.byjohnpurcell;

import java.util.List;
import java.util.stream.Stream;

/**
 * Section 30: Streams
 * Videos 376: Generating Streams
 * @author 2099643
 *
 */
public class GeneratingStreams {

	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,6).forEach(System.out::println);
		
		System.out.println();

		/**
		 *  We can also generate streams using stream.generate(), 
		 *  this will generate infinite sequential unordered streams where each element is provided by the supplier.	
		 *  We can use intermediate stream operation called "limit()".
		 *  This will return elements of the Stream no longer than size specified in it. 	 
		 */		
		Stream.generate(()->"hello").limit(3).forEach(System.out::println);
		
		/**
		 * Another way of generating streams is from Collections interface
		 * and use generated streams
		 */
		List.of(1,2,3,4,5,6,7,8,9,10).stream().forEach(System.out::println);
		
		
		
	}

}
