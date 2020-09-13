package ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import studdetails.StudentDetails;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class GPA extends JFrame implements ActionListener{
	JFrame f;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public GPA() {
		
		
		//getContentPane().add(textField, BorderLayout.NORTH);
		//.setColumns(10);
		f=new JFrame();
		
		f.getContentPane().setLayout(null);
		
		JLabel lblGpaCheck = new JLabel("ROLL NO CHECK");
		lblGpaCheck.setBounds(146, 32, 106, 14);
		f.getContentPane().add(lblGpaCheck);
		
		JLabel lblRollNo = new JLabel("ROLL NO");
		lblRollNo.setBounds(47, 99, 46, 14);
		f.getContentPane().add(lblRollNo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 98, 86, 20);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCheck = new JButton("CHECK");
		btnCheck.setBounds(133, 149, 89, 23);
		f.getContentPane().add(btnCheck);
		f.setSize(640,542);
		getContentPane().setVisible(true);
		f.setVisible(true);
		btnCheck.addActionListener(this);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<StudentDetails.Student.size();i++)
		
		{
			if(StudentDetails.Student.get(i).rollNo.equals(textField_1.getText()))
			{
				new  GPAForm(textField_1.getText(),i);
				
				//System.out.println("hesga");
				
				f.dispose();
			}
			
		}
		f.dispose();
		
	}
}
