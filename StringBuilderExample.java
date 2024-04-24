package FileHandling;

public class StringBuilderExample {

	public static void main(String[] args) {
		// StringBuilder Example. StringBuilder is Mutable. Strings are Mutable
		
		StringBuilder str= new StringBuilder("Welcome to UST");
		
		System.out.println(str);
		
		str.append(",Narendra");
		System.out.println(str);
		

		str.insert(14," Bengaluru");
		System.out.println(str);
		
		str.replace(11,14, "UST GLOBAL");
		System.out.println(str);
		
		str.delete(15,22);
		System.out.println(str);
		
		
	}

}
