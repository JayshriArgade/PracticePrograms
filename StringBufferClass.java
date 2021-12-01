
public class StringBufferClass {

	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("Program");
		
		System.out.println(s);
		
		String str = new String(s); //Converts String buffer to string
		StringBuffer s1 = new StringBuffer(str);  //Converts string to String buffer
		String str1 = s1.toString();  // Converts string buffer to string by literal way
		System.out.println(str1);
		
		System.out.println(s.capacity()); //Returns the current capacity.The capacity is the no. of chars that can be stored
		
		System.out.println(s.charAt(3)); //Returns the char value at the specified index
		
		System.out.println(s.codePointAt(2)); //Returns the character (Unicode code point) at the specified index.
		
		System.out.println(s.delete(4, 7)); //Removes the characters in a substring of this sequence
		
		System.out.println(s.deleteCharAt(3)); //Removes the char at the specified position in this sequence
		
		System.out.println(s.insert(3, "gram")); //Inserts the string into this character sequence. 
		
		System.out.println(s.reverse()); //character sequence to be replaced by the reverse of the sequence
		System.out.println(s.reverse());
		
		
		System.out.println(s.append("ming")); //Appends the specified string to this character sequence
		System.out.println(s.capacity());
		s.trimToSize();
		System.out.println(s.capacity());
	}

}
