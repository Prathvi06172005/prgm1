
package com;
import java.io.File;
import java.io.IOException;
public class TextFile
	{
	public static void main(String[] args) {
			// Correct path for Mac
		File ref =  new File("/Users/pooja/OneDrive/Desktop/FILESYSTEM/Demo3.txt");
		boolean b = ref.exists();
			
		if(b == false)
		{
			try
			{
				ref.createNewFile();
				System.out.println("File created successfully");
			}
			catch (IOException e)
			{
				// Handle exception
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("File Exists");
		}
	}
	}
