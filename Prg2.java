package coma;

public class Prg2{
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		System.out.println("program start");
		
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("diviseble not possible");
			
		}
		System.out.println("program ends");
	}
}