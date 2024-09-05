package com.streams.byjohnpurcell;

import java.util.List;

/**
 * Transforming Streams
 * @author 2099643
 *
 */

class Person{
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}

public class TransformingStreams {

	public static void main(String[] args) {
		/**
		 * Using Maps in Streams.
		 * Map method maps from one object to another.
		 * example if one has Stream of streams it can 
		 */
		
		/*
		 * Converting below list into Streams of list or Person
		 */
		var name = List.of("Varun","Devanshu","Arpit","Ajit","Oliva","Martin","Jassi","Jora");
		
//		name
//			.stream()
//			.map(n->new Person(n))// another way of writing the function within map()
//			.forEach(System.out::println);
//		
		name.stream().map(Person::new).forEach(System.out::println);
		
			
		
		
		
		
	}

}
