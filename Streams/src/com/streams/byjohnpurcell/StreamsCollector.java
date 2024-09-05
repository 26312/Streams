package com.streams.byjohnpurcell;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class People{
	private String name;
	
	public People(String name) {
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
		return "People: " + name ;
	}
	
	
}
public class StreamsCollector {

	public static void main(String[] args) {
		var names = List.of("Varun","Devanshu","Arpit","Manju","Ritu","Oliva","Aref");
		
		//names.stream().map(People::new).forEach(System.out::println);

		/**
		 * Collect is a terminal stream method
		 * In Stream we have some kind of generator i.e. stream()
		 * we have one or more intermediate methods i.e. map(), that change the data in the stream typically
		 * and at the end we have some kind of terminal operation i.e. forEach(), count() or collect()
		 * collect()- collects all the items in the stream together and put them in some kind of Data Structure.
		 */
		
		var list = names
				.stream()
				.map(People::new)
				.collect(Collectors.toList());
		
		for(var person:list) {
			System.out.println(person.getClass());
			System.out.println(person);
		}
	}

}
