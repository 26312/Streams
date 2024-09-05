package com.streams.byjohnpurcell;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Section 30: Streams
 * Videos 377: Generating Streams
 * @author 2099643
 *
 */

public class GeneratingStreamsFromFiles {

	public static void main(String[] args) throws IOException {
		Files.lines(Paths.get("Interface_Stream.txt")).forEach(System.out::println);
		
	}

}
