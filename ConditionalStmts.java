import java.util.Scanner;

public class ConditionalStmts {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		
		
		if(a%2==0)
			System.out.println(a+" is even number");
		else
			System.out.println(a+" is odd number");	
		
		if( (a % 3 == 0) && (a % 5 == 0) )
			System.out.println(a+" is divisible by 3 and 5");
		else
			System.out.println(a+" is not divisible by 3 and 5");
		
		System.out.println();
		
		char c = 'u';
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c == 'u')
			System.out.println(c+" is an vowel");
		else
			System.out.println(c+" is not vowel");
		sc.close();

	}

}
