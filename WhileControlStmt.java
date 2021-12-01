
public class WhileControlStmt {

	public static void main(String[] args)
	{
		String name[] = {"ram", "sham", "sita", "gita", "prem", "radha"};
		
		int size = name.length;
		System.out.println("length of array is "+size);
		
		int index = 0;
		
		System.out.println("------------ WHILE ---------------");  
		
		while(index < size)
		{
			System.out.println(name[index]);
			index++;
		}
		
		System.out.println("------------ DO WHILE ---------------");
		
		 int rev = size-1;
		 int i=0;
		do
		{
			
			System.out.println(name[rev]);
			rev--;
			
		}while(rev >= i);

	}

}
