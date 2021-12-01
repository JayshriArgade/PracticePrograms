
public class PalindromeString {

	public static void main(String[] args)
	{
		String str = new String("Madam");
		
		String str1 = new String();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str1 = str1 + str.charAt(i);
		}
		
		System.out.println("Actual String=  "+str);
		System.out.println("Reversed String=  "+str1);
		
		if(str.equals(str1))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}

}
