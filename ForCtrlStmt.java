
public class ForCtrlStmt
{

	public static void main(String[] args)
	{
		int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		
		System.out.println("Array Elements in Ascending Order");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.print(a[i] +"  ");
		}

		System.out.println();
		System.out.println("Array Elements in Descending Order");
		for(int i=a.length-1 ; i>=0 ; i--)
		{
			System.out.print(a[i]+"  ");
		}
	}

}
