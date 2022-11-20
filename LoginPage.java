package LoginPage;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import HomePage.HomePage;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class LoginPage {

	public JFrame frame;
	public JTextField textField;
	public JPasswordField passwordField;
	public JCheckBox chckbxNewCheckBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame("LoginPage");
		frame.setBounds(100, 100, 1384, 751);
		frame.setExtendedState(frame.MAXIMIZED_BOTH );
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(419, 291, 330, 53);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 55));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PassWord");
		lblPassword.setBounds(419, 369, 330, 53);
		lblPassword.setFont(new Font("Tahoma", Font.ITALIC, 55));
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(784, 291, 450, 53);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					passwordField.requestFocus();
				}
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(37, 190, 354, 403);
		Image img=new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblNewLabel_1);
		

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(784, 433, 448, 14);
		lblNewLabel_2.setForeground(new Color(255, 128, 128));
		frame.getContentPane().add(lblNewLabel_2);
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(1059, 512, 175, 62);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxNewCheckBox.setSelected(false);
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			
				if(textField.getText().contains("@")==false) {
					lblNewLabel_2.setText("Invaid user Name please check '@' is missing");
				}
				if(textField.getText().contains(" ")) {
					lblNewLabel_2.setText("Invaid user Name please check ' ' spaces are not allowed");
				}
				if(textField.getText().contains("@")) {
					lblNewLabel_2.setText("");
				}
				
				if(passwordField.getText().contains(" ")) {
					lblNewLabel_2.setText("Invaid Password please check ' ' spaces are not allowed");
				}
				if(textField.getText()==""&&passwordField.getText()=="") {
					lblNewLabel_2.setText("Enter User Name & Password ");
				}
				if(passwordField.getText().length()<8) {
					lblNewLabel_2.setText("Invaid Password please check Password must have 8 characters");
				}
				if(lblNewLabel_2.getText()=="") {
					
					HomePage homepage=new HomePage();
					homepage.homeFrame.setVisible(true);
					frame.dispose();
					}
				
			}
		});
		Image img1=new ImageIcon(this.getClass().getResource("/Ok.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img1));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		frame.getContentPane().add(btnNewButton);
		
		 chckbxNewCheckBox = new JCheckBox("");
		 chckbxNewCheckBox.setBounds(1243, 398, 26, 23);
		 chckbxNewCheckBox.addKeyListener(new KeyAdapter() {
		 	@Override
		 	public void keyPressed(KeyEvent e) {
		 		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
		 			btnNewButton.doClick();
		 		}
		 	}
		 });
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
					
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(1243, 369, 26, 22);
		Image eye=new ImageIcon(this.getClass().getResource("/eye.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(eye));
		frame.getContentPane().add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(784, 370, 450, 53);
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					btnNewButton.doClick();
				}
			}
		});
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(passwordField);
		
		
		
		
	}
}
