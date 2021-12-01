import java.util.Scanner;

public class NestedIfElseExample {

	public static void main(String[] args)
	{
	    String s = "Boy";
	    
	    if(s == "Girl")
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter age");
	    	int age = sc.nextInt();
	    	
	    	if(age >= 18)
	    		System.out.println("Hello Girl, You are not Teenager");
	    	else
	    		System.out.println("Hello Girl, You are Teenager");
	    	
	    	sc.close();
	    }
	    
	    else if(s == "Boy")
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter age");
	    	int age = sc.nextInt();
	    	
	    	if(age >= 18)
	    		System.out.println("Hello Boy, You are not Teenager");
	    	else
	    		System.out.println("Hello Boy, You are Teenager");
	    	
	    	sc.close();
	    }
	    
	    else
	    {
	    	System.out.println("Please mention your Gender properly");
	    }
 
      
	}

}
