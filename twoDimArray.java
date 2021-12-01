
public class twoDimArray {

	public static void main(String[] args)
	{
		int num[][] = { {12,45} , {67,23} , {11,88} , {87,32} };
		//System.out.println(num[0][1]);
		
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(num[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
