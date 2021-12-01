import java.util.Arrays;
import java.util.Scanner;

public class StringsWithSameCharSet {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string ");
		String s1 = sc.next();
		
		System.out.println("Enter second string");
		String s2 = sc.next();
		
		char[] str = s1.toCharArray();
		char[] str1 = s2.toCharArray();
		
		Arrays.sort(str);
		Arrays.sort(str1);
		
		boolean status = false;
		
		for(int i=0 ;i<str.length ; i++)
		{
			if(str[i] == str1[i])
			{
				status = true;
			}
			else
			{
				status = false;
				break;
			}
		}
		
		if(status)
			System.out.println("Both Strings have same Character set");
		else
			System.out.println("Both Strings desn't have same Character set");
		
		
		/*int status = 1;
		
		for(int i=0 ;i<str.length ; i++)
		{
			status = Character.compare(str[i] , str1[i]);
			if(status != 0 )
				break;
		}
		
		if(status == 0)
			System.out.println("Both Strings have same Character set");
		else
			System.out.println("Both Strings desn't have same Character set");
		*/
		sc.close();
	}

}
