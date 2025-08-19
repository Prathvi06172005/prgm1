package com;

public class DownCasting {
	public static void main(String[] args)
	{
		Mom m=new Daughter();
		System.out.println(m.name);
		Daughter d=(Daughter) m;
		System.out.println(d.name);
		System.out.println(d.age);
	}

}
