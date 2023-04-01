package restuarantmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_food {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_food window = new Admin_food();
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
	public Admin_food() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 845, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 811, 416);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setBounds(354, 42, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(465, 42, 85, 21);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(586, 42, 85, 21);
		panel.add(btnDelete);
		
		JLabel lblNewLabel = new JLabel("Food name");
		lblNewLabel.setBounds(371, 99, 100, 13);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(469, 96, 217, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(371, 143, 100, 13);
		panel.add(lblType);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Italy", "Nepal", "Korean"}));
		comboBox.setBounds(471, 139, 215, 21);
		panel.add(comboBox);
		
		table = new JTable();
		table.setBounds(377, 190, 380, 205);
		panel.add(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new After_login();
				
			}
		});
		btnBack.setBounds(197, 355, 85, 21);
		panel.add(btnBack);
	}
}
