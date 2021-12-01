import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PwdValidation {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password = ");
		String pwd = sc.next();
		
		Pattern p = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#?$&]).{8,13}");
        
		Matcher m = p.matcher(pwd);
		
		if(m.find())
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}

}
