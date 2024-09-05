package com.streams.in28minutes;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsTerminalOperations {

	public static void main(String[] args) {
		
		// Below List uses stream() to print the element which is the max value from the elements in the List
		Optional<Integer> maxlist = List.of(23,12,34,53).stream().max((n1,n2)->Integer.compare(n1, n2));
			System.out.println("maxList: "+maxlist);
			
		// Print minimum value from the elements in List
		Optional<Integer> minList = List.of(23,12,34,53).stream().min((n1,n2)->Integer.compare(n1, n2));
		System.out.println("minList: "+minList);
		
		// Print even numbers from the List and return it as a List
		List<Integer> numList = List.of(23,12,34,53,63).stream().filter(n->n%2==1).collect(Collectors.toList());
		System.out.println("Odd Number elements from List: "+numList);
		

		List<Integer> numList2 = List.of(23,12,34,53,63).stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Even Number elements from List: "+numList2);
		
		List<Integer> num = IntStream.range(1, 11).map(n->n*n).boxed().collect(Collectors.toList());
		System.out.println("square of forst 10 numbers: "+num);
	}

}
