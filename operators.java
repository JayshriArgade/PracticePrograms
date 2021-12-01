
public class operators
{
	public static void main(String[] args)
	{
		// logical operators
		
		// logical AND &&
		/*  The logical && operator doesn't check the second condition if the first condition is false.
		  It checks the second condition only if the first one is true.*/
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("------------------");
		
		// logical OR ||
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("------------------");
		
		// Bitwise AND &
		//The bitwise & operator always checks both conditions whether first condition is true or false.
		
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		
	}

}
