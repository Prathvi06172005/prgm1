package coma;

public class ArrayException {
	public static void main(String [] args)
	{
		int arr[]= {11,22,33,44};
		System.out.println("start");
		try {
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("invalid access");
		}
		System.out.println("ends");
	}
}

		
			

		
