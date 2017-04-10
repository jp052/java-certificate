import java.time.*;
import java.time.temporal.UnsupportedTemporalTypeException;

public class PeriodAndDurationTest {
	public static void main(String[] args) {
		PeriodAndDurationTest period = new PeriodAndDurationTest();
		period.createPeriod();
		period.createDuration();
		period.usageOfPeriod();
		
	}
	
	public void createPeriod() {
		System.out.println("\n createPeriod:");
		
		Period anually =  Period.ofYears(1); //every year
		Period quarterly = Period.ofMonths(3); //every 2 month
		Period everyThreeWeeks = Period.ofWeeks(3); //every 3 weeks
		Period everyOhterDay = Period.ofDays(2); //every 2 days
		Period everyYearAndWeek = Period.of(1, 0, 7); //every year and 7 days
		Period everyYearAndMonthAndWeek = Period.of(1, 2, 7); //every year, 2 month and 7 days
		
		System.out.println("everyOhterDay: " + everyOhterDay);
		System.out.println("everyYearAndMonthAndWeek: " + everyYearAndMonthAndWeek);
		
		//Chaining ist beim erstellen von Period nicht möglich, da es statische methoden sind.
		Period wrong = Period.ofYears(1).ofWeeks(1); //only every week. Year is ignored
		
		System.out.println("wrong: " + wrong);		
	}
	
	/**
	* Verwendet für Zeiträume unter einem Tag.
	**/
	public void createDuration() {
		System.out.println("\n createDuration:");
		
		Duration days = Duration.ofDays(2); //in Stunden dargestellt
		Duration hours = Duration.ofHours(4);
		//Duration weeks = Duration.ofWeeks(3); DOES NOT COMPILE. Duration hat keine Wochen.
		
		System.out.println("days: " + days); 
		System.out.println("hours: " + hours);
	}
	
	public void usageOfPeriod() {
		System.out.println("\n usageOfPeriod:");
		
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period = Period.ofMonths(1);
		System.out.println(dateTime); 
		System.out.println(date.plus(period)); 
		System.out.println(dateTime.plus(period)); 
		
		try {
			System.out.println(time.plus(period));   //Time kann kein Monat hinzugefügt werden. UnsupportedTemporalTypeException: Unsupported unit: Months
		} catch (UnsupportedTemporalTypeException e) {
			e.printStackTrace();
		}		
	}
}