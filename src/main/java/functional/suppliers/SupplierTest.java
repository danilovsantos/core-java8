package functional.suppliers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		Supplier<LocalDate> today = LocalDate::now;
		
		MyDateSupplier<LocalDate> yesterday = () -> LocalDate.now().minusDays(1);
		
		MyDateSupplier<LocalDate> tomorrow = new MyDateSupplier<LocalDate>(){

			@Override
			public LocalDate get() {
				return LocalDate.now().plusDays(1);
			}
			
		};
		
		System.out.println("Today     - "+ today.get().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
		System.out.println("Yesterday - "+ yesterday.get().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
		System.out.println("Tomorrow  - "+ tomorrow.get().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));

	}

}
