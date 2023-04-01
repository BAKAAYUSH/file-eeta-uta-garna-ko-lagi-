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
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Nepal {

	private JFrame frame;
	private JTextField txtThakaliSetRs;
	private JTextField txtYomariRs;
	private JTextField txtChatamariRs;
	private JTextField txtBaraRs;
	private JTextField txtSamayBajiRs;
	private JTextField txtMomoRs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nepal window = new Nepal();
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
	public Nepal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 903, 667);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(10, 10, 869, 610);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 255));
		panel_1.setBounds(0, 0, 869, 610);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dal bhat");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(303, 574, 61, 26);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 72, 252, 156);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\riyan\\Downloads\\abhishek-sanwa-limbu-5Q-7kgG7xbo-unsplash (3).jpg"));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(25, 441, 193, 141);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\riyan\\desktop\\yamari (1).jpg"));
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(243, 263, 112, 147);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\riyan\\Downloads\\chatamari-1152x1536 (1).jpg"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 139, 139));
		panel_2.setBounds(412, 0, 457, 610);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("MENU");
		lblNewLabel_4.setBounds(202, 5, 103, 40);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(new Color(50, 205, 50));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 34));
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(100, 456, 45, 13);
		panel_2.add(lblNewLabel_8);
		
		txtThakaliSetRs = new JTextField();
		txtThakaliSetRs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtThakaliSetRs.setText("Thakali Set                                     Rs.480/-");
		txtThakaliSetRs.setColumns(10);
		txtThakaliSetRs.setBounds(79, 94, 349, 32);
		panel_2.add(txtThakaliSetRs);
		
		txtYomariRs = new JTextField();
		txtYomariRs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtYomariRs.setText("Yomari                                            Rs.50/-");
		txtYomariRs.setBounds(79, 161, 349, 32);
		panel_2.add(txtYomariRs);
		txtYomariRs.setColumns(10);
		
		txtChatamariRs = new JTextField();
		txtChatamariRs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtChatamariRs.setText("Chatamari                                          Rs.30/-");
		txtChatamariRs.setBounds(79, 237, 349, 34);
		panel_2.add(txtChatamariRs);
		txtChatamariRs.setColumns(10);
		
		txtBaraRs = new JTextField();
		txtBaraRs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtBaraRs.setText("Bara                                                  Rs.30/-");
		txtBaraRs.setBounds(79, 312, 349, 32);
		panel_2.add(txtBaraRs);
		txtBaraRs.setColumns(10);
		
		txtSamayBajiRs = new JTextField();
		txtSamayBajiRs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtSamayBajiRs.setText("Samay Baji                                      Rs.120/-");
		txtSamayBajiRs.setBounds(79, 381, 349, 40);
		panel_2.add(txtSamayBajiRs);
		txtSamayBajiRs.setColumns(10);
		
		txtMomoRs = new JTextField();
		txtMomoRs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtMomoRs.setText("Momo                                            Rs.180/-");
		txtMomoRs.setBounds(79, 456, 349, 32);
		panel_2.add(txtMomoRs);
		txtMomoRs.setColumns(10);
		
		JButton btnNewButton = new JButton("Place order");
		btnNewButton.setBackground(new Color(222, 184, 135));
		btnNewButton.setBounds(302, 565, 145, 21);
		panel_2.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(222, 184, 135));
		btnBack.setBounds(34, 565, 111, 21);
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
