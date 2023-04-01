package restuarantmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import java.awt.Scrollbar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
		frame.setVisible(true);
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 883, 643);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(0, 0, 404, 606);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome Back");
		lblNewLabel_1.setBounds(48, 106, 123, 19);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(93, 252, 242, 39);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setBounds(93, 216, 111, 26);
		lblNewLabel_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password ");
		lblNewLabel_3.setBounds(93, 315, 98, 19);
		lblNewLabel_3.setForeground(new Color(128, 128, 128));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Submit ");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(93, 530, 111, 31);
		btnNewButton.setBackground(new Color(204, 255, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new After_login();
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Create new account ");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(229, 530, 165, 31);
		btnNewButton_1.setBackground(new Color(204, 255, 204));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new signup();
			}
		});
		panel.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(93, 344, 242, 39);
		panel.add(passwordField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		comboBox.setBounds(93, 438, 242, 39);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Customer"}));
		comboBox.setToolTipText("");
		panel.add(comboBox);
		
		JLabel lblNewLabel_3_1 = new JLabel("Choose");
		lblNewLabel_3_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_3_1.setBounds(93, 415, 98, 19);
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel = new JLabel("L5CG2");
		lblNewLabel.setBounds(38, 10, 195, 93);
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.BOLD, 50));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("Sign in with your username and password.");
		lblNewLabel_5.setBounds(47, 135, 223, 19);
		lblNewLabel_5.setForeground(new Color(128, 128, 128));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setBounds(303, 252, 32, 39);
		lblNewLabel_5_1_1.setIcon(new ImageIcon("C:\\Users\\riyan\\Downloads\\check-mark.png"));
		panel.add(lblNewLabel_5_1_1);
		
		JPanel lblIcon = new JPanel();
		lblIcon.setBounds(403, 0, 495, 606);
		frame.getContentPane().add(lblIcon);
		lblIcon.setLayout(null);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setIcon(new ImageIcon("C:\\Users\\riyan\\Downloads\\tim-toomey-STqHLqMne3k-unsplash (1) (7)_auto_x1.jpg"));
		lblNewLabel_5_1.setBounds(0, 0, 485, 606);
		lblIcon.add(lblNewLabel_5_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 0, 454, 606);
		lblIcon.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(440, 593, -446, -598);
		lblIcon.add(label_1);
	}
}
