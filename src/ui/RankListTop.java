package ui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import studdetails.StudentDetails;
import studdetails.StudentGPA;

public class RankListTop extends JPanel {
	JPanel f;
	

	/**
	 * Create the panel.
	 */
	public RankListTop() {
		
		f=new JPanel(); 
		//f.setTitle("DISPLAY STUDENT DETAILS"); 
		JTable j;

		String columnNames[]= {"NAME","ROLL NO","DEPARTMENT","GPA"};
		String data[][]=new String[StudentGPA.gpalist.size()][4];

		for(int i=0;i<StudentDetails.Student.size();i++)
		{
			for(int k=0;k<4;k++)
			{
				if(k==0)
					data[i][k]=StudentGPA.gpalist.get(i).ref.name;
				if(k==1)
					data[i][k]=StudentGPA.gpalist.get(i).ref.rollNo;
				if(k==2)
					data[i][k]=StudentGPA.gpalist.get(i).ref.branch;
				if(k==3)
					data[i][k]=Float.toString(StudentGPA.gpalist.get(i).gpa);

			}
		}
		j = new JTable(data, columnNames); 
		j.setBounds(30, 40, 200, 300); 

		JScrollPane sp = new JScrollPane(j); 
		f.add(sp);
		f.setSize(500,400);  
		f.setVisible(true); 
		

	}

}
