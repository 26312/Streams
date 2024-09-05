package com.streams.byseankennedy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Section 2:Streams
 * Video 17 :Stream Laziness
 * @author 2099643
 *
 */
public class StreamLaziness {

	public static void main(String[] args) {
		/**
		 * Stream.of is a static method which enables to pass in vars,args and create Stream of that type.
		 * The stream is passed into a filter,filter takes in a predicate or an argument and returns true or false.
		 * In this case filter returns "true" since we want to look at how data flow from the source and progress
		 * through the pipeline. forEach() takes in a consumer or an input and returns nothing.
		 * forEach() in this case is a terminal operation which kicks off the whole thing.
		 */
//		Stream.of("Alex","David","April","Edward")
//		.filter(s -> {
//			System.out.println("filter: " + s);
//			return true;
//		}).forEach(s-> System.out.println("forEach: " + s));
		
		
		/**
		 * In below example we are using map with stream. The map takes in a string and returns upper case
		 * version of the string passed. This stream of string is then passed through method anyMatch()
		 * which takes in the Upper case version of the passed string and returns element which matches the
		 * specified condition passed within startsWith().
		 * 
		 * In this example the program ends when first true is returned, i.e., April
		 * 
		 */
//		Stream.of("Blex","David","April","Edward")
//		.map(s->{
//			System.out.println("map: " + s);
//			return s.toUpperCase();
//		})
//		.anyMatch(s->{
//			System.out.println("anyMatch: " + s);
//			return s.startsWith("A");
//		});
	
	
		List<String> names = Arrays.asList("April","Ben","Charlie","David"," Benlidius","Christian");
		
		names.stream()
		.peek(System.out::println)
		.filter(s->{
			System.out.println("filter 1: " + s);
			return s.startsWith("B") || s.startsWith("C");
		})
		.filter(s->{
			System.out.println("filter 2: " + s);
			return s.length()>3;
		})
		.limit(1)
		.forEach(System.out::println);
		
	
	
	
	
	
	
	
	}

}
