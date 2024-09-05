package com.streams.in28minutes;

import java.util.List;

/**
 * Sort, Distinct, Map & Filter
 * @author 2099643
 *
 */
public class StreamIntermediateOperations {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(3,5,8,213,45,4,7);
		 //Using Functional Programming print the list in sorted format		 
		//list.stream().sorted().forEach(number->System.out.println("List1: "+number));
		
		
		// Below list comprise of duplicate elements in the list
		List<Integer> list2 = List.of(3,5,3,8,213,45,4,7,45);
		
		// Using functional programming print the list in format such that duplicate values do not repeat itself
//		list2.stream()
//				.sorted() // if you remove this operator, the list will print values in order of their input
//				.distinct() // sorted() & distinct() are intermediate operation
//				.forEach(numbers->System.out.println("List2: "+numbers)); // this is the terminal operation
	
	
		List<Integer> list3= List.of(3,5,3,8,213,45,4,7,45);
		list3.stream()
			.distinct().map(e -> e * e)
			.sorted()
			.forEach(element -> System.out.println("List3: " + element));
	
	
	}

}
