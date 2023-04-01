package restuarantmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

public class Korean {

	private JFrame frame;
	private JTextField txtGimbapRs;
	private JTextField txtBimbapRs;
	private JTextField txtTteokgukRs;
	private JTextField txtKimchiJjigaeRs;
	private JTextField txtRamyunRs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Korean window = new Korean();
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
	public Korean() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 986, 693);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 952, 646);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 255));
		panel_1.setBounds(0, 0, 378, 636);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\riyan\\Downloads\\filippo-faruffini-M1M9PVArnlE-unsplash (1).jpg"));
		label.setBounds(10, 21, 239, 236);
		panel_1.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\riyan\\Downloads\\ryan-kwok-H6iSwrAOMG0-unsplash (6).jpg"));
		lblNewLabel_1.setBounds(72, 281, 296, 333);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 139, 139));
		panel_2.setBounds(374, 0, 578, 636);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("MENU");
		lblNewLabel_2.setBounds(267, 10, 128, 40);
		lblNewLabel_2.setForeground(new Color(50, 205, 50));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 34));
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Place order");
		btnNewButton.setBackground(new Color(222, 184, 135));
		btnNewButton.setBounds(399, 558, 139, 21);
		panel_2.add(btnNewButton);
		
		txtGimbapRs = new JTextField();
		txtGimbapRs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtGimbapRs.setText("Gimbap                                                           Rs.480/-");
		txtGimbapRs.setBounds(110, 115, 433, 32);
		panel_2.add(txtGimbapRs);
		txtGimbapRs.setColumns(10);
		
		txtBimbapRs = new JTextField();
		txtBimbapRs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtBimbapRs.setText("Bimbap                                                             Rs.400/-");
		txtBimbapRs.setBounds(110, 194, 438, 40);
		panel_2.add(txtBimbapRs);
		txtBimbapRs.setColumns(10);
		
		txtTteokgukRs = new JTextField();
		txtTteokgukRs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtTteokgukRs.setText("Tteokguk                                                           Rs.520/-");
		txtTteokgukRs.setBounds(110, 285, 438, 40);
		panel_2.add(txtTteokgukRs);
		txtTteokgukRs.setColumns(10);
		
		txtKimchiJjigaeRs = new JTextField();
		txtKimchiJjigaeRs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtKimchiJjigaeRs.setText("Kimchi Jjigae                                                   Rs.300/-");
		txtKimchiJjigaeRs.setBounds(110, 366, 433, 40);
		panel_2.add(txtKimchiJjigaeRs);
		txtKimchiJjigaeRs.setColumns(10);
		
		txtRamyunRs = new JTextField();
		txtRamyunRs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtRamyunRs.setText("Ramyun                                                          Rs.260/-");
		txtRamyunRs.setBounds(110, 441, 433, 40);
		panel_2.add(txtRamyunRs);
		txtRamyunRs.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(222, 184, 135));
		btnBack.setBounds(110, 558, 139, 21);
		panel_2.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new Menu();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new Place_order();
			}
		});
		frame.setVisible(true);
	}
}
