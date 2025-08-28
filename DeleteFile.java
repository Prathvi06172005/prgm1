package com;
import java.io.File;
public class DeleteFile
{
	public static void main(String[] args)
	{
		File ref = new File("/Users/pooja/OneDrive/Desktop/FILESYSTEM/Demoo.txt");
		boolean b = ref.exists();
		if(b==true)
		{
			ref.delete();
			System.out.println("deleted");
		}
		else
		{
			System.out.println("File not found");
		}
	}
}
