package FileHandling;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConcatStrings {
static String userdetails[];
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
try {
		File myFile= new File("C://Users//Administrator//Documents//UST.txt");
		
		System.out.println(myFile.exists());
		try (Scanner myScanner = new Scanner(myFile)) {
			while (myScanner.hasNextLine())
			{
				String Line = myScanner.nextLine();
				//System.out.println(Line);
				userdetails  = Line.split(",");
				
				for(int i=0;i<userdetails.length;i++)
				{
				switch(i)
				{
				case 0:
					{
						System.out.print("Username:"+ userdetails[i]);
						break;
					}
					case 1:
					{
						System.out.println("||password:"+ userdetails[i]);
						break;
					}
				}
				
			}
}
		}

}
catch(FileNotFoundException f)
{System.out.println("File Not Found");
}
}
}