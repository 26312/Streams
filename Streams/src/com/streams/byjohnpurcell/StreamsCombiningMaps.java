package com.streams.byjohnpurcell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StreamsCombiningMaps {

	public static void combine(Map<String,Integer> map1, Map<String,Integer> map2) {
		
		map2.forEach((word,count2)->{
			Integer count1 = map1.get(word); 
			
			if(count1==null) {
				map1.put(word, count2);
			}
			else {
				map1.put(word, count1 + count2);
			}
			
		});
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		var map1 = new HashMap<String,Integer>(Map.of("one",1,"two",2));
		var map2 = new HashMap<String,Integer>(Map.of("two",2,"three",3,"four",4));
		
//		combine(map1, map2);
//		System.out.println(map1); 
//		
		var wordCount = Files.lines(Paths.get("Interface_Stream.txt"))
							.map(s->s.split("^[a-zA-Z]"))
							.map(Arrays::asList)
							.flatMap(l-> l.stream())
							.collect(
									HashMap<String,Integer>::new,
									(map,word) -> {
										Integer count = map1.get(word); 
										if(count==null) {
											map.put(word, 1);
										}
										else {
											map.put(word, count + 1);
										}
									},
									StreamsCombiningMaps::combine					
									);
		
		System.out.println(wordCount);

	}

}
