package FileHandling;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.junit.jupiter.api.Test;


class JlocalDateTimeProp {

	@Test
	void CheckGreeting() throws IOException {
		LocalDateTime now= LocalDateTime.now();
		System.out.println("Before Formatting: " + now);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = now.format(format);
		System.out.println("AfterFormatting: " + formatDateTime);
		
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("C://Users//Administrator//eclipse-workspace//MyProject//src//FileHandling//myConfig.properties");
		p.load(fis);
		
		String ExpectedGreeting = p.getProperty("ExpectedGreeting");
		System.out.println(ExpectedGreeting);
		String ExpectedGreet = ExpectedGreeting;
		System.out.println("ExpectedGreet"+ExpectedGreet);
		
		String ActualGreeting = null;
		int T= LocalTime.now().getHour();	
		System.out.println(T);
		if(T<12)
		{
		ActualGreeting = "Morning";
			System.out.println(ActualGreeting);
	
	}
		else 
			if(T>12 && T<15)
			{
		ActualGreeting = "Afternoon";
		System.out.println(ActualGreeting);
			}
			else 
			
	if(T>15 && T<19)
				{
			ActualGreeting = "Evening";
			System.out.println(ActualGreeting);
				}
assertEquals(ExpectedGreet, ActualGreeting);
	}

	
}