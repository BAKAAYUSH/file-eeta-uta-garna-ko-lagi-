package restuarantmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import database.DB_connect;
import database.Retreive;
import database.Update;

import javax.swing.JScrollPane;

public class Staff {

	private JFrame frame;
	private JTable table;
	private JTextField id;
	private JTextField name;
	private JTextField emailtxt;
	private JTextField contacttxt;
	private JTextField type;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff window = new Staff();
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
	public Staff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
public void insert(ArrayList<Object[]> user,DefaultTableModel model ) {
		
		/**
		 * inserting the rows of the course table with the data fromt he database
		 */
		for(Object[] row : user) {
			model.addRow(row);
		}
		 
	}
	
	
	private void initialize() {
		
		Retreive ret = new Retreive();
		ArrayList<Object[]> user = ret.retreive();
		
		
		System.out.println(user);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 918, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 894, 441);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("signup");
				frame.setVisible(false);
				new After_login();
			}
		});
		btnNewButton.setBounds(756, 380, 114, 38);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 24, 317, 395);
		panel.add(scrollPane);
		
		
		table = new JTable();
		model = new DefaultTableModel();
		scrollPane.setViewportView(table);
		Object[] studentColumn = {"ID", "Name", "Email", "Contact"};
		model.setColumnIdentifiers(studentColumn);
		table.setModel(model);
		
		insert(user,model);
		/**===============================================================================================*/
		
		
		
	
		JButton btnUpdateStaff = new JButton("Update staff");
		btnUpdateStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Object[]> user = Update.Userupdate()	+ "VALUES('" + Staff.id.getText() + "','"
						+ Staff.name.getText() + "','" 
				+ Staff.email.getText() + "','"
						+ Staff.contact.getText() + "','" 
						+ Staff.type.getText()
						+ "')";
			}
		});
		btnUpdateStaff.setBounds(402, 24, 114, 38);
		panel.add(btnUpdateStaff);
		
		JButton btnDeleteStaff = new JButton("Delete staff");
		btnDeleteStaff.setBounds(542, 24, 114, 38);
		panel.add(btnDeleteStaff);
		
		JButton btnAddStaff = new JButton("Add staff");
		btnAddStaff.setBounds(685, 24, 114, 38);
		panel.add(btnAddStaff);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(377, 157, 106, 13);
		panel.add(lblNewLabel);
		
		JLabel contact = new JLabel("Phone number");
		contact.setBounds(377, 248, 106, 13);
		panel.add(contact);
		
		JLabel mode = new JLabel("user");
		mode.setBounds(377, 294, 106, 13);
		panel.add(mode);
		
		JLabel email = new JLabel("email");
		email.setBounds(377, 203, 106, 13);
		panel.add(email);
		
		JLabel lblIdNumber = new JLabel("ID ");
		lblIdNumber.setBounds(377, 103, 106, 13);
		panel.add(lblIdNumber);
		
		id = new JTextField();
		id.setBounds(493, 100, 271, 19);
		panel.add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(493, 154, 271, 19);
		panel.add(name);
		
		emailtxt = new JTextField();
		emailtxt.setColumns(10);
		emailtxt.setBounds(493, 200, 271, 19);
		panel.add(emailtxt);
		
		contacttxt = new JTextField();
		contacttxt.setColumns(10);
		contacttxt.setBounds(493, 245, 271, 19);
		panel.add(contacttxt);
		
		type = new JTextField();
		type.setColumns(10);
		type.setBounds(493, 291, 271, 19);
		panel.add(type);
		frame.setVisible(true);
	}
}
