package FileHandling;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now= LocalDateTime.now();
		System.out.println("Before Formatting: " + now);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = now.format(format);
		System.out.println("AfterFormatting: " + formatDateTime);
		int T= LocalTime.now().getHour();	
		System.out.println(T);
		switch(T)
		{
		case 0:
			System.out.print("Good Morning");
			break;
		case 1:
			System.out.print("Good Morning");
			break;
		case 2:
			System.out.print("Good Morning");
			break;
		case 3:
			System.out.print("Good Morning");
			break;
		case 4:
			System.out.print("Good Morning");
			break;
		case 5:
			System.out.print("Good Morning");
			break;
		case 6:
			System.out.print("Good Morning");
			break;
		case 7:
			System.out.print("Good Morning");
			break;
		case 8:
			System.out.print("Good Morning");
			break;
		case 9:
			System.out.print("Good Morning");
			break;
		case 10:
			System.out.print("Good Morning");
			break;
		case 11:
			System.out.print("Good Morning");
			break;
		case 12:
			System.out.print("Good AfterNoon");
			break;
		case 13:
			System.out.print("Good AfterNoon");
			break;
		case 14:
			System.out.print("Good AfterNoon");
			break;
		case 15:
			System.out.print("Good AfterNoon");
			break;
		case 16:
			System.out.print("Good Evening");
			break;
		case 17:
			System.out.print("Good Evening");
			break;
		case 18:
			System.out.print("Good Evening");
			break;
		case 19:
			System.out.print("Good Evening");
			break;
		case 20:
			System.out.print("Good Night");
			break;
		case 21:
			System.out.print("Good Night");
			break;
		case 22:
			System.out.print("Good Night");
			break;
		case 23:
			System.out.print("Good Night");
			break;
	
	}
	}
}
