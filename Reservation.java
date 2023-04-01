package restuarantmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;

public class Reservation {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation window = new Reservation();
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
	public Reservation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 921, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 7, 901, 446);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Back'");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new After_login();
			}
		});
		btnNewButton.setBounds(250, 376, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnBook = new JButton("Book");
		btnBook.setBounds(469, 33, 85, 21);
		panel.add(btnBook);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(580, 33, 85, 21);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(695, 33, 85, 21);
		panel.add(btnDelete);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(395, 102, 70, 13);
		panel.add(lblNewLabel);
		
		JLabel lblPhoneNumber = new JLabel("Phone number");
		lblPhoneNumber.setBounds(363, 144, 70, 13);
		panel.add(lblPhoneNumber);
		
		JLabel lblNic = new JLabel("NIC");
		lblNic.setBounds(375, 184, 70, 13);
		panel.add(lblNic);
		
		JLabel lblTableNumber = new JLabel("Table number");
		lblTableNumber.setBounds(662, 102, 70, 13);
		panel.add(lblTableNumber);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(742, 98, 109, 21);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(449, 98, 176, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(451, 138, 176, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(449, 182, 176, 19);
		panel.add(textField_2);
		
		table = new JTable();
		table.setBounds(461, 229, 412, 201);
		panel.add(table);
		frame.setVisible(true);
		
	}
}
