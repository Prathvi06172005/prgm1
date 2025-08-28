
package com;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile
{
	public static void main(String[] args)
	{
		FileWriter ref = null;
		
		try
		{
			ref = new FileWriter("/Users/pooja/OneDrive/Desktop/FILESYSTEM/Demo2.txt");
			ref.write("Hai Uma");
			ref.write("\n");
			ref.write("Hello Siva");
			ref.flush();
			System.out.println("Write Completed");
			
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ref.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

