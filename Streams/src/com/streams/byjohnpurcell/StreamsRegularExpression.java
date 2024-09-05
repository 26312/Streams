package com.streams.byjohnpurcell;

public class StreamsRegularExpression {

	public static void main(String[] args) {
		
		String line = "This is a sentence. It contains some words, and some puntuations.";
		
		String[] words = line.split("[^a-zA-Z]");
		
		for(String word: words) {
			System.out.println(word);
		}

	}

}
