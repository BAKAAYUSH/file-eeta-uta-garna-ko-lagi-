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

public class italy {

	private JFrame frame;
	private JTextField txtBisteccaFiorentinaRs;
	private JTextField txtMozarellaDiBufala;
	private JTextField txtPastaCarbonaraRs;
	private JTextField txtCicchettiRs;
	private JTextField txtFilettiDiBaccala;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					italy window = new italy();
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
	public italy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 978, 667);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 944, 620);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 400, 620);
		panel_1.setBackground(new Color(240, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\riyan\\Downloads\\calum-lewis-rPkgYDh2bmo-unsplash (1).jpg"));
		lblNewLabel_1.setBounds(67, 10, 254, 302);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\riyan\\Downloads\\gabriella-clare-marino-h7Bmptisp5o-unsplash (2).jpg"));
		lblNewLabel_2.setBounds(-40, 354, 452, 227);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(405, 0, 537, 620);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 139, 139));
		panel_3.setBounds(401, 0, 543, 620);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(222, 184, 135));
		btnBack.setBounds(117, 577, 147, 21);
		panel_3.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setForeground(new Color(50, 205, 50));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 34));
		lblNewLabel.setBounds(249, 29, 113, 40);
		panel_3.add(lblNewLabel);
		
		txtBisteccaFiorentinaRs = new JTextField();
		txtBisteccaFiorentinaRs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtBisteccaFiorentinaRs.setText("Bistecca Fiorentina                                Rs.480/-");
		txtBisteccaFiorentinaRs.setBounds(117, 127, 382, 40);
		panel_3.add(txtBisteccaFiorentinaRs);
		txtBisteccaFiorentinaRs.setColumns(10);
		
		txtMozarellaDiBufala = new JTextField();
		txtMozarellaDiBufala.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtMozarellaDiBufala.setText("Mozarella Di Bufala                                Rs.630/-");
		txtMozarellaDiBufala.setBounds(117, 211, 382, 40);
		panel_3.add(txtMozarellaDiBufala);
		txtMozarellaDiBufala.setColumns(10);
		
		txtPastaCarbonaraRs = new JTextField();
		txtPastaCarbonaraRs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtPastaCarbonaraRs.setText("Pasta Carbonara                                    Rs.320/-");
		txtPastaCarbonaraRs.setBounds(117, 304, 382, 40);
		panel_3.add(txtPastaCarbonaraRs);
		txtPastaCarbonaraRs.setColumns(10);
		
		txtCicchettiRs = new JTextField();
		txtCicchettiRs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtCicchettiRs.setText("Cicchetti                                                Rs.420/-");
		txtCicchettiRs.setBounds(117, 396, 382, 40);
		panel_3.add(txtCicchettiRs);
		txtCicchettiRs.setColumns(10);
		
		JButton btnNewButton = new JButton("Place order");
		btnNewButton.setBackground(new Color(222, 184, 135));
		btnNewButton.setBounds(352, 577, 147, 21);
		panel_3.add(btnNewButton);
		
		txtFilettiDiBaccala = new JTextField();
		txtFilettiDiBaccala.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		txtFilettiDiBaccala.setText("Filetti Di Baccala                                   Rs.430/-");
		txtFilettiDiBaccala.setBounds(117, 481, 382, 40);
		panel_3.add(txtFilettiDiBaccala);
		txtFilettiDiBaccala.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new Place_order();
			}
		});
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new Menu();
			}
		});
		frame.setVisible(true);
		
	}

}
