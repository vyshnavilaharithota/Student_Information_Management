package ui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import studdetails.StudentDetails;
import studdetails.StudentGPA;

import java.awt.Font;

public class UiStudentDetails implements ActionListener {  
	JFrame f;  
	JTabbedPane tabbedPane;
	UiStudentDetails(){  
		f=new JFrame("WELCOME TO STUDENT INFO MANAGEMENT SYSTEM"); 
		f.setSize(640,524);
	
		//f.setSize(400,400);  
		f.getContentPane().setLayout(null);  
		

		 tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 603, 465);

		f.getContentPane().add(tabbedPane);
		
		KK kk = new KK();
		tabbedPane.add("Student Entry",kk);
		tabbedPane.add("List",Studlist());
		tabbedPane.add("Merit List",TopRankList());
		
		JLabel lblStudentDetailsEntry = new JLabel("STUDENT DETAILS ENTRY");
		lblStudentDetailsEntry.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblStudentDetailsEntry.setBounds(200, 11, 164, 14);
		kk.add(lblStudentDetailsEntry);
		
		JButton btnStopAddingEntries = new JButton("Stop Adding Entries");
		btnStopAddingEntries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				new UiStudentDetails(); 
				//new GPA();
			
			}
		});
		btnStopAddingEntries.setBounds(216, 234, 184, 23);
		kk.add(btnStopAddingEntries);
		//tabbedPane.add("hello",new JPanel());
		f.setVisible(true);
	} 

	public static JPanel Studlist() 
	{ 

		JPanel f = new JPanel(); 
		//f.setTitle("DISPLAY STUDENT DETAILS"); 
		JTable j;

		String columnNames[]= {"NAME","ROLL NO","GENDER","DEPARTMENT"};
		String data[][]=new String[StudentDetails.Student.size()][4];

		for(int i=0;i<StudentDetails.Student.size();i++)
		{
			for(int k=0;k<4;k++)
			{
				if(k==0)
					data[i][k]=StudentDetails.Student.get(i).name;
				if(k==1)
					data[i][k]=StudentDetails.Student.get(i).rollNo;
				if(k==2)
					data[i][k]=StudentDetails.Student.get(i).gender;
				if(k==3)
					data[i][k]=StudentDetails.Student.get(i).branch;

			}
		}
		j = new JTable(data, columnNames); 
		j.setBounds(30, 40, 200, 300); 

		JScrollPane sp = new JScrollPane(j); 
		f.add(sp);
		f.setSize(200, 200);  
		f.setVisible(true); 
		return f;
	}
	
public static JPanel TopRankList() {
		
		JPanel f=new JPanel(); 
		//f.setTitle("DISPLAY STUDENT DETAILS"); 
		JTable j;

		String columnNames[]= {"NAME","ROLL NO","DEPARTMENT","GPA"};
		String data[][]=new String[StudentGPA.gpalist.size()][4];

		for(int i=0;i<StudentGPA.gpalist.size();i++)
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
		
		return f;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	} 
	
	
	
}