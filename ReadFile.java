package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
static String userdetails[];
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
try {
		File myFile= new File("C://Users//Administrator//Documents//UST.txt");
		
		System.out.println(myFile.exists());
		Scanner myScanner = new Scanner(myFile);
		while (myScanner.hasNextLine())
		{
			String Line = myScanner.nextLine();
			System.out.println(Line);
		}
}
catch(FileNotFoundException f)
{System.out.println("File Not Found");
}
	}
}