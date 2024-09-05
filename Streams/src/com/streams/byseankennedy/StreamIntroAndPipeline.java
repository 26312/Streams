package com.streams.byseankennedy;
/**
 * Section 2:Streams
 * Video 16 :Introduction and Stream Pipelines
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamIntroAndPipeline {

	public static void main(String[] args) {
	
		List<Double> temp = Arrays.asList(98.4,100.2,87.9,102.8);
		
		
		/** 
		 * adding a new element into the list will throw a compiler error:UnsupportedOperationException.
		 * This is because List passed by Arrays.asList() is a fixed size List backed by specified arrays.
		 * This means we can modify the elements within this list, but cannot add or remove
		 * new elements from it.
		 */
//		temp.add(100.8); 
//		System.out.println(temp);
		
		List<Double> newTemp = new ArrayList<>(temp);
		newTemp.add(109.6);
		System.out.println("New Temperature(newTemp) from ArrayList: "+newTemp);
		
		System.out.println("Number if temperature greater than 100: " + temp
																		.stream()
																		.peek(System.out::println)
																		.filter(temps -> temps >100)
																		.peek(System.out::println)
																		.count());
		
		ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6));
		//numbers.stream().forEach(System.out::println);
		numbers.stream().forEach(n -> {
			System.out.println(n);
		});
		
		
	}

}
