package com.java.functional;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.java.beans.Person;

public class Functions {

	public static void main(String[]args){
		
		try{
			
			List<Person> persons = new ArrayList<Person>();
			Stream<String> stream = Files.lines(Paths.get("C:/Users/dvsantos1/Desktop/persons.csv"));
			String[] array = stream.toArray(l -> new String[l]);
			
			for(String line : array){
				
				String[] columns = line.split(",");
				
				persons.add(new Person(columns[0], 
						    new Integer(columns[1]), 
						    LocalDate.parse(columns[2], 
						    DateTimeFormatter.ofPattern("dd/MM/yyyy")), 
						    columns[3], 
						    columns[4]));
			}
			
			
			stream.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
