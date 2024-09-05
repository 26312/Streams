package com.streams.in28minutes;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class StreamIntermideiateOperationsExercise {

	public static void main(String[] args) {
		
		// Exercise-1: Print square of first 10 numbers
		// use IntStream.range(1,10)
		
		//List<Integer> numList = List.of(1,2,3,4,5,6,7,8,9,10);
		IntStream.range(1, 11).map(e->e*e).forEach(e->System.out.println(e));
		
		// Create stream of List like: List.of("Apple","Vat","Bat","Cat","Dog").stream()
		// Map all these to lowercase and print them
		Stream<String> stringList = List.of("Apple","Vat","Bat","Cat","Dog").stream();
			 stringList.map(e->e.toLowerCase()).forEach(element->System.out.println(element));
			 
			 
			 
		// Create stream of List like: List.of("Apple","Vat","Bat","Cat","Dog").stream()
		// Print length of each element in the list
		Stream<String> stringLengthList = List.of("Apple","Vat","Bat","Cat","Dog").stream();
		stringLengthList.map(e->e.length()).forEach(e->System.out.println("lenght of each element in list: " +e));
	}

}
