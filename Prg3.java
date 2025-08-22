package coma;

public class Prg3 {
	
		public static void main(String [] args)
		{
			String name="Rama";
			
			System.out.println("start");
			try {
				System.out.println(name.charAt(2));
				System.out.println(name.charAt(5));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("invalid access");
			}
			System.out.println("ends");
		}
	}

			
				

		
