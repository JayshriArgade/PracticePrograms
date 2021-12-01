package PatternProgramsSM1;

public class Pattern13 {

	public static void main(String[] args)
	{		
		for(int i=0 ; i<5 ; i++)
		{
			for(int j=5 ; j>i ; j--)
			{
				System.out.print("  ");
			}
			for(int k=i ; k>=0 ; k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
//Output
/*
           *
         * *
       * * *
     * * * *
   * * * * *

 */