package studdetails;
import java.io.Serializable;
import java.util.*;
import ui.*;

public class StudentDetails implements Serializable {
	
		public String name;
		public String rollNo;
		public int age;
		public String gender;
		public long phone;
		public String branch;
		public static ArrayList<StudentDetails> Student=new ArrayList<StudentDetails>();
		//ArrayList<StudentDetails> Student;
		
		public StudentDetails(String name,String rollNo,int age,String gender,long phone,String branch)
		{
			this.name=name;
			this.rollNo=rollNo;
			this.gender=gender;
			this.age=age;
			this.phone=phone;
			this.branch=branch;
			
		}
		public static String method(StudentDetails ref)
		{
			return(ref.name+","+ref.rollNo+","+ref.gender+","+ref.branch);
		}
		
}



//public static void main(String args[]) throws InterruptedException
//{
//	new AddStudentDetails1();
//	Thread t=Thread.currentThread();
//	t.sleep(20000);
//	System.out.println(StudentDetails.Student.get(0));
//}
//}