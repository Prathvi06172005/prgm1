package com;
import java.io.File;

public class Filee {
	public static void main(String [] args)
	{
		File ref=new File("/Users/pooja/OneDrive/Desktop/FILESYSTEM");
		boolean b = ref.exists();
		
		if(b==false)
		{
			ref.mkdir(); //Folder created
			System.out.println("folder created");
		}
		else
		{
			System.out.println("Folder exists");
		}
	}
}






