package PatternProgramsSM1;

public class Pattern22 {

	public static void main(String[] args)
	{
		for(int i=0 ; i<5;i++)
		{
			for(int j=5 ; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int k=0 ; k<i ; k++)
			{
				System.out.print("A ");
			}
			System.out.println();
		}
	}
}
//Output
/*
     A 
    A A 
   A A A 
  A A A A 

 */