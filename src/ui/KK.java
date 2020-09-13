package ui;

import javax.swing.JPanel;
import java.io.*;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;

import studdetails.StudentDetails;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;

public class KK extends JPanel implements ActionListener,Serializable{
	//JFrame f;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField branch;
	JButton btnAdd;
	String str;

	/**
	 * Create the panel.
	 */
	public KK() {
		//f=new JFrame();
		
		setLayout(null);
		setSize(600,600);
		ButtonGroup g=new ButtonGroup();
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 45, 600, 185);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 11, 46, 14);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(77, 8, 107, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblRollNumber = new JLabel("Roll Number");
		lblRollNumber.setBounds(320, 11, 73, 14);
		panel.add(lblRollNumber);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(431, 8, 107, 20);
		panel.add(textField_1);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(10, 36, 46, 14);
		panel.add(lblAge);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(77, 33, 107, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(431, 33, 107, 20);
		panel.add(textField_3);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(320, 36, 73, 14);
		panel.add(lblGender);
		
		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setBounds(10, 65, 58, 14);
		panel.add(lblPhoneNo);
		
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(77, 62, 107, 20);
		panel.add(textField_4);
				JLabel lblBranch = new JLabel("Branch");
				lblBranch.setBounds(320, 65, 46, 14);
				panel.add(lblBranch);
			branch=new JTextField();
			branch.setBounds(431,65,107,20);
			panel.add(branch);
				
				 btnAdd = new JButton("ADD");
				btnAdd.setBounds(264, 136, 65, 23);
				panel.add(btnAdd);

	btnAdd.addActionListener(this);

		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	StudentDetails temp=new StudentDetails(textField.getText(),textField_1.getText(),Integer.parseInt(textField_2.getText()),textField_3.getText(),Long.parseLong(textField_4.getText()),branch.getText());
	System.out.println("lily");
		StudentDetails.Student.add(temp);

			
		
	
		try {
			FileOutputStream fos=new FileOutputStream("pig.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(StudentDetails.Student);
			oos.flush();
			oos.close();
			
		} catch (Exception e1) {}
		
		try {
			
			FileInputStream fos1=new FileInputStream("pig.txt");
			ObjectInputStream oos1=new ObjectInputStream(fos1);
			StudentDetails.Student=(ArrayList<StudentDetails>)oos1.readObject();
		//	oos.flush();
			oos1.close();
			
		} catch (Exception e2) {}
		
		//}	//new AddFacultyDetails();
		//new GPA();
		//dispose();
		//new KK();
		
	}


	
	

}




//package ui;
//
//import javax.swing.JPanel;
//import java.io.*;
//import javax.swing.JRadioButton;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//
//import studdetails.StudentDetails;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//
//import javax.swing.ButtonGroup;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//
//public class KK extends JFrame implements ActionListener,Serializable{
//	JFrame f;
//	private JTextField textField;
//	private JTextField textField_1;
//	private JTextField textField_2;
//	private JTextField textField_3;
//	private JTextField textField_4;
//	private JTextField branch;
//	
//	String str;
//
//	/**
//	 * Create the panel.
//	 */
//	public KK() {
//		f=new JFrame();
//		
//		f.setLayout(null);
//		f.setSize(600,600);
//		ButtonGroup g=new ButtonGroup();
//		
//		JPanel panel = new JPanel();
//		panel.setBounds(0, 40, 600, 185);
//		getContentPane().add(panel);
//		panel.setLayout(null);
//		
//		JLabel lblName = new JLabel("Name");
//		lblName.setBounds(10, 11, 46, 14);
//		panel.add(lblName);
//		
//		textField = new JTextField();
//		textField.setBounds(77, 8, 107, 20);
//		panel.add(textField);
//		textField.setColumns(10);
//		
//		JLabel lblRollNumber = new JLabel("Roll Number");
//		lblRollNumber.setBounds(320, 11, 73, 14);
//		panel.add(lblRollNumber);
//		
//		textField_1 = new JTextField();
//		textField_1.setColumns(10);
//		textField_1.setBounds(431, 8, 107, 20);
//		panel.add(textField_1);
//		
//		JLabel lblAge = new JLabel("Age");
//		lblAge.setBounds(10, 36, 46, 14);
//		panel.add(lblAge);
//		
//		textField_2 = new JTextField();
//		textField_2.setColumns(10);
//		textField_2.setBounds(77, 33, 107, 20);
//		panel.add(textField_2);
//		
//		textField_3 = new JTextField();
//		textField_3.setColumns(10);
//		textField_3.setBounds(431, 33, 107, 20);
//		panel.add(textField_3);
//		
//		JLabel lblGender = new JLabel("Gender");
//		lblGender.setBounds(320, 36, 73, 14);
//		panel.add(lblGender);
//		
//		JLabel lblPhoneNo = new JLabel("Phone No");
//		lblPhoneNo.setBounds(10, 65, 46, 14);
//		panel.add(lblPhoneNo);
//		
//		
//		textField_4 = new JTextField();
//		textField_4.setColumns(10);
//		textField_4.setBounds(77, 62, 107, 20);
//		panel.add(textField_4);
//				JLabel lblBranch = new JLabel("Branch");
//				lblBranch.setBounds(320, 65, 46, 14);
//				panel.add(lblBranch);
//			branch=new JTextField();
//			branch.setBounds(431,65,107,20);
//			panel.add(branch);
//				
//				JButton btnAdd = new JButton("ADD");
//				btnAdd.setBounds(271, 151, 56, 23);
//				panel.add(btnAdd);
//				//JButton btnStop = new JButton("STOP");
//				//btnAdd.setBounds(271, 220, 56, 23);
//				//panel.add(btnStop);
//		btnAdd.addActionListener(this);
//		//btnStop.addActionListener(this);
//		JPanel panel_1 = new JPanel();
//		panel_1.setBounds(0, 11, 600, 23);
//		//add(panel_1);
//		
//		JLabel lblStudentDetailsForm = new JLabel("STUDENT DETAILS FORM");
//		panel_1.add(lblStudentDetailsForm);
//		
//		JPanel panel_2 = new JPanel();
//		panel_2.setBounds(0, 253, 600, 336);
//		//add(panel_2);
//		panel_2.add(Studlist());
//		panel.setVisible(true);
//		panel_1.setVisible(true);
//		panel_2.setVisible(true);
//	f.getContentPane().add(panel);
//	f.getContentPane().add(panel_1);
//	f.getContentPane().add(panel_2);
//
//		f.setVisible(true);
//		
//		
//		
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//		StudentDetails temp=new StudentDetails(textField.getText(),textField_1.getText(),Integer.parseInt(textField_2.getText()),textField_3.getText(),Long.parseLong(textField_4.getText()),branch.getText());
//		StudentDetails.Student.add(temp);
//		//if(e.getActionCommand().contentEquals("ADD"))
//		//{
//			
//		
//	////	System.out.println(str);
//		try {
//			FileOutputStream fos=new FileOutputStream("pig.txt");
//			ObjectOutputStream oos=new ObjectOutputStream(fos);
//			oos.writeObject(StudentDetails.Student);
//			oos.flush();
//			oos.close();
//			
//		} catch (Exception e1) {}
//		
//		try {
//			//ArrayList<StudentDetails> temp1=new ArrayList<StudentDetails>();
//			FileInputStream fos1=new FileInputStream("pig.txt");
//			ObjectInputStream oos1=new ObjectInputStream(fos1);
//			StudentDetails.Student=(ArrayList<StudentDetails>)oos1.readObject();
//			//StudentDetails.Student.add(temp1);
//			//temp1
//			
//			
//		//	oos.flush();
//			oos1.close();
//			
//		} catch (Exception e1) {}
//		
//		//}	//new AddFacultyDetails();
//		new GPA();
//		f.dispose();
//		new KK();
//		
//	}
//
//
//	
//	
//	public static JPanel Studlist() 
//	{ 
//
//		JPanel f = new JPanel(); 
//		//f.setTitle("DISPLAY STUDENT DETAILS"); 
//		JTable j;
//
//		String columnNames[]= {"NAME","ROLL NO","GENDER","DEPARTMENT"};
//		String data[][]=new String[StudentDetails.Student.size()][4];
//		
//		for(int i=0;i<StudentDetails.Student.size();i++)
//		{
//			for(int k=0;k<4;k++)
//			{
//				if(k==0)
//					data[i][k]=StudentDetails.Student.get(i).name;
//				if(k==1)
//					data[i][k]=StudentDetails.Student.get(i).rollNo;
//				if(k==2)
//					data[i][k]=StudentDetails.Student.get(i).gender;
//				if(k==3)
//					data[i][k]=StudentDetails.Student.get(i).branch;
//
//			}
//		}
//		j = new JTable(data, columnNames); 
//		j.setBounds(30, 40, 200, 300); 
//
//		JScrollPane sp = new JScrollPane(j); 
//		f.add(sp);
//		f.setSize(200, 200);  
//		f.setVisible(true); 
//		return f;
//	} 
//}
//
