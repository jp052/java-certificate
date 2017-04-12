import java.time.*;
import java.time.format.*;
import java.time.temporal.UnsupportedTemporalTypeException;

public class DatesAndTime {
	public static void main(String[] args) {
		DatesAndTime dateTime = new DatesAndTime();
		dateTime.createLocalDateAndTime();
		dateTime.manipulateDateAndTime();
		dateTime.dateTimeToLong();
		dateTime.dateTimeFormattingWithoutTimeZone();
		dateTime.parseDateTime();
	}
	
	private void createLocalDateAndTime() {
		System.out.println("\n createLocalDateAndTime:");
		
		//aktuell:
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		//nur date:
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20); //Better to read.
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		System.out.println(date1);
		System.out.println(date2);
		
		//nur time:
		LocalTime time1 = LocalTime.of(6, 15); //hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); //+ nanoseconds
		
		//date und time:
		//Es gibt noch viele weitere Kombinationsmöglichkeiten.
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30, 200); //alles in einer Zeile.
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1); //besser lesbar mit date und time object.
		
		//Es kann kein direktes neues Object über den new Operator angelegt werden!!
		//LocalDate d = new LocalDate(); //DOES NOT COMPILE!
		
		//Es muss immer der richtige Wert übergeben werden, sonst gibt es exceptions.
		try {
			LocalDate.of(2015, Month.JANUARY, 32);
		} catch(DateTimeException e) {
			e.printStackTrace(); // Invalid value for DayOfMonth (valid values 1 - 28/31): 32
		}		
	}
	/**
	* LocalDate etc ist immuntable!
	**/
	private void manipulateDateAndTime() {
		System.out.println("\n manipulateDateAndTime:");
		
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date);
		date = date.plusDays(2);
		date = date.plusWeeks(1);
		date = date.plusMonths(1);
		date = date.plusYears(5);
		System.out.println(date);
		
		LocalTime time = LocalTime.of(5,15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime);
		dateTime = dateTime.minusDays(1);
		dateTime = dateTime.minusHours(10);
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime);
		
		//chaining:
		LocalDateTime dateTimeChained = LocalDateTime.of(date, time)
			.minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println("chained: " + dateTimeChained);
		
		//Watch out for this:
		date.plusDays(10); //Ändert date nicht, da es immutable ist. Nur der return Wert enthält die Änderung.
		System.out.println("unchanged: " + date);
		
		//date = date.plusMinutes(1); //DOES NOT COMPILE. LocalDate hat keine Minuten.
	}
	
	private void dateTimeToLong() {
		System.out.println("\n dateTimeToLong:");
		
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5,15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		long daysSince1970 = date.toEpochDay();
		//long secondsSince1970 = dateTime.toEpochSecond(); //does not work
		System.out.println("daysSince1970: " + daysSince1970);
		//System.out.println("secondsSince1970: " + secondsSince1970);		
	}
	
	private void dateTimeFormattingWithoutTimeZone() {
		System.out.println("\n dateTimeFormattingWithoutTimeZone:");
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(date.getDayOfWeek()); //MONDAY
		System.out.println(date.getMonth()); //JANUARY
		System.out.println(date.getYear()); //2020
		System.out.println(date.getDayOfYear()); //20
		
		//Besser mit gelöst mit Formatter:
		LocalTime time = LocalTime.of(11, 12 ,34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		//lesbare Formatter
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT); //auch möglich: FormatStyle.MEDIUM
		System.out.println(shortDateTime.format(dateTime)); // 1/20/20
		System.out.println(shortDateTime.format(date)); // 1/20/20
		
		try {
			System.out.println(shortDateTime.format(time)); // Exception: Time kann nicht als Date formatiert werden.
		} catch (UnsupportedTemporalTypeException e) {
			e.printStackTrace();
		}	
		
		//andere Variante:
		System.out.println(dateTime.format(shortDateTime));
		System.out.println(date.format(shortDateTime));
		
		//custom Formatter:
		DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println("date from custom formatter: " + dateTime.format(customFormatter));  //Januar 20, 2020, 11:12
	}	
	
	private void parseDateTime() {
		System.out.println("\n parseDateTime:");
		
		DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate dateParsedByCustomFormatter = LocalDate.parse("01 02 2015", customFormatter);
		LocalTime timeParsedByDefaultFormatter = LocalTime.parse("11:22"); 
		System.out.println("dateParsedByCustomFormatter: " + dateParsedByCustomFormatter); //2015-01-02
		System.out.println("timeParsedByDefaultFormatter: " + timeParsedByDefaultFormatter); //11:22
		
	}
	
}