package com.streams.byjohnpurcell;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsImplementingCollectors {

	public static void main(String[] args) {
		
		var result = Stream.of("one","two","three","four")
					.collect( 
							() -> new ArrayList<String>(),
							(list,item)-> list.add(item),
							(product1,product2) -> product1.addAll(product2)
							);
		System.out.println(result);
		

	}

}
