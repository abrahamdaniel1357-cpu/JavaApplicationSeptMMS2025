import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalTimeDate;
import java.time.format.DataTimeFormatter;


public class UsingDateTimeFormatter{
	public static void main(String[] args){
		
		LocalDate myBirthDate = LocalDate.of(0000,00,00);
		DateTimeFormart Formater1 = DataTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormart Formater2 = DataTimeFormatter.ofPattern("dd-MM-yyyy");
		
		System.out.println(today.format(formatter1));
		System.out.println(today.format(formatter2));
		
		LocalTimeDate now = LocalTimeDate.now():
		
		System.out.println("dd
				now.format(DateTimeFormartter.ofPattern)
				
				LocalDateTime now = LocalDateTime.now();
		
		System.out.println("dd : "+
				now.format(DateTimeFormatter.ofPattern("dd")));
				
		System.out.println("MM : "+
				now.format(DateTimeFormatter.ofPattern("MM")));
				
		System.out.println("MMM : "+
				now.format(DateTimeFormatter.ofPattern("MMM")));
				
		System.out.println("MMMM : "+
				now.format(DateTimeFormatter.ofPattern("MMMM")));
				
		System.out.println("yy : "+
				now.format(DateTimeFormatter.ofPattern("yy")));
				
		System.out.println("yyy : "+
				now.format(DateTimeFormatter.ofPattern("yyy")));
				
		System.out.println("yyyy : "+
				now.format(DateTimeFormatter.ofPattern("yyyy")));
		
		System.out.println("HH	: " +
				now.format(DateTimeFormatter.ofPattern("HH")));
				
		System.out.println("hh	: " +
				now.format(DateTimeFormatter.ofPattern("hh")));
				
		System.out.println("mm	: " +
				now.format(DateTimeFormatter.ofPattern("hh")));
	}
}