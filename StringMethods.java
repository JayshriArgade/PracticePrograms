
public class StringMethods {

	public static void main(String[] args)
	{
	   String str = new String("Selenium");
	   String str1 = new String("selenium");
	   
	   System.out.println(str.charAt(3)); //Returns character at index=3
	   
	   System.out.println(str.codePointAt(1)); //Returns ASCII value of character
	   
	   System.out.println(str.compareTo("Selenium")); // compares 2 strings
	   
	   System.out.println(str.compareToIgnoreCase(str1));  // compares 2 strings ignoring case
	   
	   System.out.println(str.concat(str1)); //Concatenates 2  strings
	   
	   System.out.println(str.contains("len"));  // Check provided string is present in string or not
	   
	   System.out.println(str.endsWith("um"));  // Checks given string ends with passed parameters
	   
	   System.out.println(str.equals(str1)); // Check 2 strings are equal or not
	   
	   System.out.println(str.equalsIgnoreCase(str1));  //Checks 2 strings by ignoring case
	   
	   System.out.println(str.indexOf('e')); // Returns index of given character
	   
	   System.out.println(str.indexOf('e', 2)); // Returns index of given character from index 2
	   
	   System.out.println(str.indexOf("um")); //Returns 1st position of given string
	   
	   System.out.println(str.isEmpty());  // Checks given string is empty or not
	   
	   System.out.println(str.lastIndexOf('e')); // Returns last index of given character
	   
	   System.out.println(str.lastIndexOf("um"));  // Returns last index of given string
	   
	   System.out.println(str.length()); // Returns length of given string
	   
	   System.out.println(str.startsWith("el")); //Returns boolean TRUE, if the string starts with given parameter
	   
	   System.out.println(str.toUpperCase()); // Returns String, by converting to upper case
	   
	   System.out.println(str.toLowerCase()); // Returns String, by converting to lower case
	   
	}

}
