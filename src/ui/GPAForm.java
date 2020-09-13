package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import studdetails.StudentDetails;
import studdetails.StudentGPA;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GPAForm extends JFrame implements ActionListener {
	JFrame f;
	private JTextField textField;
	private JTextField textField_1;
	JButton btnSubmit;
	String rollno;
	int index;
	


	public GPAForm(String a,int i) {
		f=new JFrame();
		//getContentPane().setLayout(null);
		f.setLayout(null);
		f.setSize(640,524);
		rollno=a;
		index=i;
		
		JLabel lblGpaEntryDetails = new JLabel("GPA DETAILS ENTRY FORM");
		lblGpaEntryDetails.setBounds(141, 11, 131, 14);
		getContentPane().add(lblGpaEntryDetails);
		
		JLabel lblRollNo = new JLabel("ROLL NO");
		lblRollNo.setBounds(37, 72, 46, 14);
		f.add(lblRollNo);
		
		JLabel label = new JLabel("");
		label.setBounds(37, 113, 46, 14);
		f.add(label);
		
		textField = new JTextField();
		textField.setBounds(209, 69, 86, 20);
		textField.setText(a);
		textField.setEditable(false);
		
		f.add(textField);
		textField.setColumns(10);
		
		JLabel lblGpa = new JLabel("GPA");
		lblGpa.setBounds(37, 113, 46, 14);
		f.add(lblGpa);
		
		textField_1 = new JTextField();
		textField_1.setBounds(209, 107, 86, 20);
		f.add(textField_1);
		textField_1.setColumns(10);
		
		 btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(170, 172, 89, 23);
		f.add(btnSubmit);
		btnSubmit.addActionListener(this);
		//f.add(getContentPane());
		
		
		f.setVisible(true);
		
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		StudentGPA temp=new StudentGPA(StudentDetails.Student.get(index),Float.parseFloat(textField_1.getText()));
		StudentGPA.gpalist.add(temp);
		System.out.println(StudentGPA.gpalist.get(0).gpa);
		System.out.println(StudentGPA.gpalist.get(0).ref.name);
		new GPA();
		new UiStudentDetails();
		f.dispose();
		
		
	}





	





	
}
