
public class StringExmple {

	public static void main(String[] args) 
	{
		// Literal way to store string
		String s = "welcome string";
		
		String s1 = "welcome string";
        
		
		// with new keyword or with object
		String str = new String("Selenium");
		
		
		String str1 = new String("Selenium");
				
		
		System.out.println(s==s1);    //== refers to address
		System.out.println(s.equals(s1));     //equals() refers to values of address
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
	}

}
