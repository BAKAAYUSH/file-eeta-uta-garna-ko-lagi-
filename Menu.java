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

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 926, 633);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 902, 582);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 139, 139));
		panel_1.setBounds(10, 10, 279, 498);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Italain Food");
		btnNewButton_1.setForeground(new Color(0, 191, 255));
		btnNewButton_1.setBounds(79, 346, 144, 21);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\riyan\\Downloads\\sahand-hoseini-f9hHQgvpM8E-unsplash (2) (6).jpg"));
		lblNewLabel.setBounds(79, 77, 127, 207);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(43, 100, 127, 207);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(0, 139, 139));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(319, 10, 279, 498);
		panel.add(panel_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Nepali Food");
		btnNewButton_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_1.setForeground(new Color(0, 191, 255));
		btnNewButton_1_1.setBounds(74, 343, 144, 21);
		panel_1_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\riyan\\desktop\\need3.jpg"));
		lblNewLabel_2.setBounds(26, 65, 229, 210);
		panel_1_1.add(lblNewLabel_2);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new Nepal();
			}
		});
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(0, 139, 139));
		panel_1_1_1.setBounds(623, 10, 279, 498);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JButton btnNewButton_1_1_1 = new JButton("Korean Food");
		btnNewButton_1_1_1.setForeground(new Color(0, 191, 255));
		btnNewButton_1_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_1_1.setBounds(70, 347, 144, 21);
		panel_1_1_1.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\riyan\\Downloads\\filippo-faruffini-M1M9PVArnlE-unsplash (1).jpg"));
		lblNewLabel_3.setBounds(41, 56, 199, 254);
		panel_1_1_1.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(240, 255, 240));
		btnNewButton.setForeground(new Color(0, 139, 139));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(796, 528, 85, 32);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new After_login();
			}
		});
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new Korean();
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new italy();
			}
		});
		frame.setVisible(true);
		
	}
}
