package com.streams.byseankennedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CreatingStreams {

	public static void main(String[] args) {
		
		/**
		 * Creating streams with Arrays
		 */
//		Double[] numbers = {1.1,2.2,3.3};
//		
//		Stream<Double> streamNumbers = Arrays.stream(numbers);
//		
//		long n = streamNumbers.count();
//		System.out.println("Number of elements: " + n);
		
		/**
		 * Creating streams with List
		 */
//		List<String> listAnimals = List.of("Dog","Cat","Mouse");
//		
//		Stream<String> streamAnimals = listAnimals.stream();
//		System.out.println("Elements in animals stream: " + streamAnimals.count());
//		
		
		/**
		 * Creating Streams with Map. Map is not a Collection, 
		 * so in order to Stream a Map, it should be converted into a Collection first 
		 * and then Stream that Collection.
		 * 
		 */
//		Map<String, Integer> nameToAges = new HashMap();
//		nameToAges.put("Anand", 56);
//		nameToAges.put("Bupendra", 60);
//		nameToAges.put("Chunky", 57);
//		nameToAges.put("Dharmendra", 61);
//		
//		System.out.println("Number of entries for nameToAges: " + 
//							nameToAges
//							.entrySet() // entrySet() will give the Set view of Map, a Collection view of Map
//							.stream()
//							.count());
		
		
		/**
		 * Creating Stream using Stream.of()
		 */
		Stream<Integer> firstStream = Stream.of(1,2,3,4,5);
		System.out.println("firstStream :"+firstStream.count());
		
		Stream<String> secondStream = Stream.of("a","b","c","d");
		System.out.println("secondStream :"+secondStream.count());
		
		Stream<WolfPack> streamWolfPack = Stream.of(new WolfPack());
		System.out.println("WolfPack: "+streamWolfPack.count());

	}

}

class WolfPack{
	
}
