package restuarantmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

public class After_login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					After_login window = new After_login();
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
	public After_login() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 907, 662);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		panel.setBounds(0, 0, 893, 635);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Food Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new Menu();
				
			}
		});
		btnNewButton.setBounds(314, 29, 101, 21);
		btnNewButton.setBackground(new Color(240, 255, 240));
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Table Reserved");
		btnNewButton_2.setBackground(new Color(240, 255, 240));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new Table();
			}
		});
		btnNewButton_2.setBounds(600, 29, 125, 21);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Log out");
		btnNewButton_4.setBackground(new Color(184, 134, 11));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_4.setBounds(755, 570, 117, 44);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new login();
			}
		});
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Today's Reservation");
		btnNewButton_5.setBounds(443, 29, 125, 21);
		btnNewButton_5.setBackground(new Color(240, 255, 240));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new Reservation();
			}
		});
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("Staff");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new Staff();
			}
		});
		btnNewButton_7.setBounds(760, 29, 95, 21);
		btnNewButton_7.setBackground(new Color(240, 255, 240));
		panel.add(btnNewButton_7);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(70, 152, 45, 47);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setBounds(81, 139, 45, 47);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setBounds(70, 145, 45, 47);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setBounds(81, 148, 45, 47);
		panel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\riyan\\Downloads\\chad-montano-MqT0asuoIcU-unsplash (3).jpg"));
		lblNewLabel_1.setBounds(443, 71, 449, 489);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\riyan\\Downloads\\food-irradiation.png"));
		lblNewLabel_3.setBounds(23, 10, 39, 52);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("L5CG2");
		lblNewLabel_4.setFont(new Font("Lucida Calligraphy", Font.BOLD, 23));
		lblNewLabel_4.setBounds(70, 20, 85, 31);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("RESTAURANT");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblNewLabel.setBounds(43, 216, 250, 44);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("&");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblNewLabel_2.setBounds(53, 266, 45, 44);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("EVENTS");
		lblNewLabel_5.setForeground(new Color(50, 205, 50));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblNewLabel_5.setBounds(108, 270, 166, 37);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("The restaurant is located at Thamel,");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(43, 353, 223, 21);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Katmandu on the territory of Freak Street.");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(43, 370, 268, 44);
		panel.add(lblNewLabel_7);
		
		JButton btnNewButton_1 = new JButton("Order Delivery");
		btnNewButton_1.setBackground(new Color(184, 134, 11));
		btnNewButton_1.setBounds(96, 442, 125, 37);
		panel.add(btnNewButton_1);
	}
}
