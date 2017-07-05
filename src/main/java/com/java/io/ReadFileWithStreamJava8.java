package com.java.io;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileWithStreamJava8 {

	public static void main(String[]args){
		readFile();
	}
	
	public static void readFile(){
		
		try{
			
			Stream<String> stm = Files.lines(Paths.get("C:/Users/dvsantos1/Desktop/mockaroo-data.csv"));
			//stm.limit(3000000).collect(Collectors.<String>toList()).parallelStream();
			stm.limit(3000000).collect(Collectors.<String>toList());
			stm.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
