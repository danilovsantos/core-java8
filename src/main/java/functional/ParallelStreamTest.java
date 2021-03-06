package functional;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import beans.Person;
import functional.predicates.PersonPredicates;

public class ParallelStreamTest {

public static void main(String[]args){
		
		try{
			
			LocalDateTime from = LocalDateTime.now() ;
			
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
			
			Stream<Person> ps = persons.parallelStream();
			
			ps.parallel().filter(PersonPredicates.ageUnder18())
			  .filter(PersonPredicates.onlyFemale())
			  .filter(PersonPredicates.nameStartWith("M"))
			  .filter(PersonPredicates.liveIn("Ban Phaeo"))
			  .limit(1000000);
		      //.forEach(i -> System.out.println(i.toString()));
			
			stream.close();
		
			System.out.println(Duration.between(from, LocalDateTime.now()).getSeconds());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
