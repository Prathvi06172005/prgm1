package com;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile
{
	public static void main(String[] args)
	{
		FileReader ref = null;
		
		try
		{
			ref = new FileReader("/Users/pooja/OneDrive/Desktop/FILESYSTEM//Demo2.txt");
			int val = ref.read();
			while(val != -1)
			{
				System.out.print((char)val);
				val = ref.read();
			}
		}
		catch (FileNotFoundException e)
		{
			// Handle the file not found exception
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// Handle the IO exception
			e.printStackTrace();
		}
		finally
		{
			// Ensure ref is not null before trying to close it
			if(ref != null) {
				try {
					ref.close();
				} catch (IOException e) {
					// Handle exception during closing
					e.printStackTrace();
				}
			}
		}
	}
}

