package ui;

import javax.swing.JApplet;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.*;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import faculty.Faculty;

public class AddFacultyDetails extends JFrame implements ActionListener,ItemListener{
	JFrame f;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	JRadioButton rdbtnCse;
	JRadioButton rdbtnEce;

	JRadioButton rdbtnEee;

	JRadioButton rdbtnCivil;

	JRadioButton rdbtnMech;

	JRadioButton rdbtnIt;
	String str;

	/**
	 * Create the applet.
	 */
	public AddFacultyDetails() {
		f=new JFrame();
		f.getContentPane().setLayout(null);
		ButtonGroup G=new ButtonGroup();
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 614, 29);
		f.getContentPane().add(panel);
		
		JLabel lblFacultyDetailsEntry = new JLabel("FACULTY DETAILS ENTRY FORM");
		lblFacultyDetailsEntry.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblFacultyDetailsEntry);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(29, 71, 46, 14);
		f.getContentPane().add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(336, 71, 46, 14);
		f.getContentPane().add(lblAge);
		
		JLabel lblQualification = new JLabel("Qualification");
		lblQualification.setBounds(29, 112, 66, 14);
		f.getContentPane().add(lblQualification);
		
		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setBounds(336, 112, 77, 14);
		f.getContentPane().add(lblPhoneNo);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(29, 155, 77, 14);
		f.getContentPane().add(lblGender);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setBounds(336, 155, 77, 14);
		f.getContentPane().add(lblBranch);
		
		textField = new JTextField();
		textField.setBounds(124, 68, 86, 20);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(439, 68, 86, 20);
		f.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(124, 109, 86, 20);
		f.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(439, 109, 86, 20);
		f.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(124, 152, 86, 20);
		f.getContentPane().add(textField_4);
		rdbtnCse = new JRadioButton("CSE");
		rdbtnCse.setBounds(429, 151, 54, 23);
		G.add(rdbtnCse);
		f.getContentPane().add(rdbtnCse);
		

		rdbtnEce = new JRadioButton("ECE");
		rdbtnEce.setBounds(488, 151, 63, 23);
		G.add(rdbtnEce);
		f.getContentPane().add(rdbtnEce);

		rdbtnEee = new JRadioButton("EEE");
		rdbtnEee.setBounds(548, 151, 66, 23);
		G.add(rdbtnEee);
		f.getContentPane().add(rdbtnEee);

		rdbtnIt = new JRadioButton("IT");
		rdbtnIt.setBounds(429, 187, 54, 23);
		G.add(rdbtnIt);
		f.getContentPane().add(rdbtnIt);

		rdbtnMech = new JRadioButton("MECH");
		rdbtnMech.setBounds(488, 187, 63, 23);
		G.add(rdbtnMech);
		f.getContentPane().add(rdbtnMech);

		rdbtnCivil = new JRadioButton("CIVIL");
		rdbtnCivil.setBounds(548, 187, 66, 23);
		G.add(rdbtnCivil);
		f.getContentPane().add(rdbtnCivil);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(260, 276, 89, 23);
		f.getContentPane().add(btnSubmit);
		btnSubmit.addActionListener(this);
		f.setSize(640,524);
		f.setVisible(true); 
		

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(rdbtnMech.isSelected())
		{
			str="MECH";
		}

		if(rdbtnCse.isSelected())
		{
			str="CSE";
		}

		if(rdbtnEce.isSelected())
		{
			str="ECE";
		}

		if(rdbtnEee.isSelected())
		{
			str="EEE";
		}

		if(rdbtnIt.isSelected())
		{
			str="IT";
		}

		if(rdbtnCivil.isSelected())
		{
			str="CIVIL";
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Faculty temp=new Faculty(textField.getText(),Integer.parseInt(textField_1.getText()),textField_2.getText(),Long.parseLong(textField_3.getText()),textField_4.getText(),str);
		// TODO Auto-generated method stub
		Faculty.f.add(temp);
		//new UiStudentDetails();
		new GPA();
		f.dispose();
		
		
		//new KK();
		//new Lily();
	}
	
}