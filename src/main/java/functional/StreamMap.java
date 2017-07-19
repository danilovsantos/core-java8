package functional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMap {
	
	public static void main(String[]args){
		
		Function<String,LocalDate> stringToDateConverter = new Function<String,LocalDate>(){
			@Override
			public LocalDate apply(String date) {	
				return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			}
		};
		
		List<String> dates = new ArrayList<String>();
		
		dates.add("08/07/2017");
		dates.add("09/07/2017");
		dates.add("10/07/2017");
		dates.add("11/07/2017");
		dates.add("12/07/2017");
		dates.add("13/07/2017");
		dates.add("14/07/2017");
		dates.add("15/07/2017");
		dates.add("16/07/2017");
		dates.add("17/07/2017");
		
		Stream<String> stream = dates.stream();
		
		stream.map(stringToDateConverter).forEach(d -> System.out.println(d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		
	}

}
