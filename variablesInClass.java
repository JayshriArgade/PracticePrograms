
public class variablesInClass
{

	 static int a = 123;    //static variable
	 int b = 47;           // instance or non-static variable
	 
	 public void display1()
	 {
		 System.out.println("Non static variable "+b);
	 }
	 
	 static void display2()
	 {
		 System.out.println("Static variable "+a);
	 }
	 
	 static void display3()
	 {
		 variablesInClass var1 = new variablesInClass();
		 int add = var1.b + a;
		 System.out.println("Addition of Static and instance variable "+add);
	 }
	 
	public static void main(String[] args) 
	{
	    // calling static method
		display2();
		
		// calling non-static method
		variablesInClass var = new variablesInClass();
		var.display1();
	    
        //addition of static & instance variable
		display3();
	}

}
