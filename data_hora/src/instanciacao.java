import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class instanciacao {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-10-11");
		LocalDateTime d05 = LocalDateTime.parse("2022-08-11T20:11:33");
		Instant d06 = Instant.parse("2022-10-12T20:14:33Z");
		Instant d07 = Instant.parse("2022-10-12T00:14:33-03:00");
		LocalDate d08 = LocalDate.parse("12/10/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("12/10/2022 20:28", fmt2);
		LocalDate d10 = LocalDate.of(2022, 10, 12);
		LocalDateTime d11 = LocalDateTime.of(2022, 12, 12, 20, 34);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
	}

}
