package faculty;

import java.util.ArrayList;

public class Faculty {
	public String name;
	public String qualification;
	public int age;
	public String gender;
	public String branch;
	public long phno;
	public static ArrayList<Faculty> f=new ArrayList<Faculty>();
	
	public Faculty(String name,int age,String qualification,long phno,String gender,String branch)
	{
		this.name=name;
		this.qualification=qualification;
		this.branch=branch;
		this.phno=phno;
		this.age=age;
		this.gender=gender;
	}
	
}
