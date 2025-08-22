package comm;

public class Student {
	int id;
	String name;
	Student(int id,String name){
		
		this.id =id;
		this.name =name;
	}
	//@Override
	//public String toString()
	//{
	//return  this.id+" "+this.name;
	//}
	public static void main(String [] args)
	{
		Student s1=new Student(84,"shiva");
		Student s2=new Student(90,"ram");
		Student [] s=new Student[2];
		s[0]=s1;
		s[1]=s2;
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].id+" "+s[i].name);
		}
		
	}

}
