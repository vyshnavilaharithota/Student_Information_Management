package ui;

import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class LoginPageFaculty extends JFrame implements ActionListener{

	JFrame f;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public LoginPageFaculty() {
		f=new JFrame("ADMINISTRATOR LOGIN");
		f.setSize(640,524);
		f.getContentPane().setLayout(null);
		
		f.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		f.getContentPane().setLayout(null);
		
		ImageIcon ii = new ImageIcon("C:\\Users\\vyshn\\OneDrive\\Desktop\\1.jpg");
	      //JLabel lable = new JLabel(ii);
	      //f.getContentPane().add(lable);
		
		JLabel lblLoginForm = new JLabel("LOGIN PAGE");
		lblLoginForm.setForeground(Color.WHITE);
		lblLoginForm.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblLoginForm.setBounds(222, 11, 152, 23);
		f.getContentPane().add(lblLoginForm);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setForeground(Color.WHITE);
		lblUserId.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		lblUserId.setBounds(105, 289, 60, 14);
		f.getContentPane().add(lblUserId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		lblPassword.setBounds(105, 347, 78, 14);
		f.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(453, 344, 104, 20);
		f.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(453, 286, 104, 20);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(272, 402, 89, 23);
		f.getContentPane().add(btnLogin);
		
		JLabel lblNewLabel = new JLabel(ii);
		lblNewLabel.setForeground(new Color(102, 204, 255));
		lblNewLabel.setBounds(0, 0, 624, 485);
		f.getContentPane().add(lblNewLabel);
		
		btnLogin.addActionListener(this);
		//f.add(getContentPane());
		btnLogin.addActionListener(this);
		f.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((textField.getText()).equals("admin")&&((passwordField.getText()).contentEquals("vasavi")))
		{
			//new AddFacultyDetails();
			//new UiStudentDetails();
			f.dispose();
			new AddFacultyDetails();
		}
		
	}
}
