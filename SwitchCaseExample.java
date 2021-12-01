import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Select symbol (+ - * / %)");
		String s = sc.next();
		
		int ans;
		
		switch(s)
		{
		case "+" :  ans = a+b;
		       System.out.println("Addition = "+ans);
			break;
		
		case "-" :  ans = a-b;
	       System.out.println("Subtraction = "+ans);
			break;
		
		case "*" :  ans = a*b;
	       System.out.println("Multiplication = "+ans);
			break;
		
		case "/" :  ans = a/b;
	       System.out.println("Division = "+ans);
			break;
		
		case "%" :  ans = a%b;
	       System.out.println("Mod = "+ans);
			break;
		
		default : System.out.println("Symbol not matched");
			break;
		}
		sc.close();

	}

}
