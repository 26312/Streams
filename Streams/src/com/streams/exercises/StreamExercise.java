package com.streams.exercises;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise {

	public static void main(String[] args) throws IOException {
	/**	
	 * Obtain a text file
	 * using streams, create a list of all words in text file
	 * 
	 * Tips:
	 * First read the file using the Files class.
	 * Split each line into an array of string(words)
	 * Transform the arrays of strings into lists of strings: use Arrays.toList()
	 * Flatten the data structure
	 * Collect the final stream together into a list
	 */
	var words =	 Files
					.lines(Paths.get("StreamExercise.txt")) // Reading the files
					.map(s->s.split("^[a-zA-Z]")) // splitting the lines in the text file
					.map(a->Arrays.asList(a)) // Transforms array of String into List of strings
					.flatMap(l-> l.stream()) // flatten the data structure into stream
					.collect(Collectors.toList()); // Collect the stream into a list
		//			.forEach(System.out::println);;// printing the contents on console to visualize the output
					
		int count=0;	
		for(String word:words) {
			System.out.println(" %-10s "+ word);
			if(count++ % 10 == 0) {
				System.out.println();
			}
		}
		
		
		
		
		
	

	}

}
