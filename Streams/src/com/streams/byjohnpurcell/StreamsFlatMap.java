package com.streams.byjohnpurcell;

import java.util.List;
import java.util.Set;

public class StreamsFlatMap {

	public static void main(String[] args) {
		
		/**
		 * Below we are passing a complex list i.e. List of Set.
		 * Idea is to first Supply List of Set into a Stream
		 */
		List<Set<Integer>> list = List.of(Set.of(1,2,3),Set.of(4,5,6),Set.of(7,8,9));
		
		/**
		 * This will return the list as Set. 
		 * 	[2, 3, 1]
		 *	[4, 5, 6]
		 *	[8, 9, 7]
		 */
		//list.stream().forEach(System.out::println);
		
		/**
		 * What is required is to supply the numbers completely into stream so this show vertically.
		 * To achieve this task we use a method provided 
		 */
		
		list
		.stream()
		.flatMap(s->s.stream())
		.forEach(System.out::println);
	}

}
