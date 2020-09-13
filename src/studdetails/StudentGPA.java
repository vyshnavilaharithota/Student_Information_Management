package studdetails;

import java.util.ArrayList;

public class StudentGPA {
	public StudentDetails ref;
	public float gpa;
	
	public static ArrayList<StudentGPA> gpalist=new ArrayList<StudentGPA>();
	
	public StudentGPA(StudentDetails ref,float gpa)
	{
		this.ref=ref;
		this.gpa=gpa;
	}

}