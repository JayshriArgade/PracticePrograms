
public class StringArrayEndsWithEd {

	public static void main(String[] args) 
	{
		String str[] = {"java", "Replaced", "madam", "placed", "selenium", "moved", "reached"};
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].endsWith("ed"))
			{
				System.out.println(str[i]);
			}
		}
	}

}
