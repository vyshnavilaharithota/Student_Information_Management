package mainclass;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JFrame;

import studdetails.StudentDetails;
import ui.*;

public class StudentInformationManagement  {
	public static void main(String args[])
	{
		try {
			//ArrayList<StudentDetails> temp1=new ArrayList<StudentDetails>();
			FileInputStream fos1=new FileInputStream("pig.txt");
			ObjectInputStream oos1=new ObjectInputStream(fos1);
			StudentDetails.Student=(ArrayList<StudentDetails>)oos1.readObject();
			//StudentDetails.Student.add(temp1);
			//temp1
			
			
		//	oos.flush();
			oos1.close();
			
		} catch (Exception e1) {}
		new LoginPageFaculty();
		
	}

}
