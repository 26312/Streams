package com.streams.byjohnpurcell;

import java.util.stream.Stream;

public class StreamsCombiners {

	public static void main(String[] args) {
		
		var lines = Stream.of("Hello","how","do","you","do","all","I","want","to","say","fine","thankyou")
					.parallel()
					.reduce("",
							(partial,full)->partial + " " + full,
							(partial,halfFull)->partial + " " + halfFull
							);
					

		System.out.println(lines);
		
	}

}
