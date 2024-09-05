package com.streams.byjohnpurcell;

import java.util.List;
import java.util.stream.Collectors;

class NewPeople{
	private String name;

	public NewPeople(String name) {
		super();
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
		return "NewPeople [name=" + name + "]";
	}
	
	
}


public class StreamsPeek {

	public static void main(String[] args) {
		/**
		 * Stream provides a method called peek() which can be used for other purposes,
		 * but the intention of it is it enables users to find out what is happening in the stream.
		 * 
		 */
		List<String> name = List.of("Varun","Devanshu","Arpit","Manju","Ritu","Oliva","Aref");
		
//		var list = name
//						.stream()
//						.map(NewPeople::new)
//						.peek(s->System.out.println(s + ": From Within Stream: " + s.getClass()))
//						.collect(Collectors.toList());
		
//		for(var names:list) {
//		//System.out.println(names.getClass());
//		System.out.println(names);
//	}
		
		var count = name
				.stream()
				.map(NewPeople::new)
				.peek(s->System.out.println(s + ": From Within Stream: " + s.getClass()))
				.count();
		System.out.println(count);
		

		
		
	}

}
