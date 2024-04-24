package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class readpropfilexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("C://Users//Administrator//eclipse-workspace//MyProject//src//FileHandling//myConfig.properties");
		p.load(fis);
		
		for (Entry<Object, Object> e:p.entrySet())
		{
			System.out.println(e);
		}
		

	}

}
