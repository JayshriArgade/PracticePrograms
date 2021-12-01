
public class PalindromeStringArray {

	public static void main(String[] args) 
	{
       String str[] = {"java", "wow", "madam", "selenium", "ramar", "pencils"};
		
		
		for(int i=0 ; i<str.length ; i++)
		{
			String str1 = new String();
			
			for(int j=str[i].length()-1 ; j>=0 ; j--)
			{
				str1 = str1 + str[i].charAt(j);
			}
			System.out.println("Actual string of index "+i+" = "+str[i]);
			System.out.println("Reverse string of index "+i+" = "+str1);
			
			if(str[i].equals(str1))
			   System.out.println("String is Palindrome");
			else
				System.out.println("String is not Palindrome");
			
			System.out.println();
		}
		
	}

}
