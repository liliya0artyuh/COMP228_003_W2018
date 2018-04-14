package com.example.windows;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.example.dbUtils.AuthorQueries;

public class InsertRecord_Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private AuthorQueries personQueries;
	private JLabel firstNameLabel;
	private JTextField firstNameTextField;
	private JLabel idLabel;
	private JTextField idTextField;
	private JLabel lastNameLabel;
	private JTextField lastNameTextField;
	private JTextField maxTextField;
	private JPanel displayPanel;
	private JButton insertButton;

	public InsertRecord_Window() {
		super("Insert New Author");

		// establish database connection and set up PreparedStatements
		personQueries = new AuthorQueries();

		// create GUI
		maxTextField = new JTextField(2);
		displayPanel = new JPanel();
		idLabel = new JLabel();
		idTextField = new JTextField(10);
		firstNameLabel = new JLabel();
		firstNameTextField = new JTextField(10);
		lastNameLabel = new JLabel();
		lastNameTextField = new JTextField(10);
		insertButton = new JButton();

		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		// setSize(400, 355);
		// setResizable(false);

		maxTextField.setHorizontalAlignment(JTextField.CENTER);
		maxTextField.setEditable(false);

		displayPanel.setLayout(new GridLayout(5, 2, 4, 4));

		idLabel.setText("Address ID:");
		displayPanel.add(idLabel);

		idTextField.setEditable(false);
		displayPanel.add(idTextField);

		firstNameLabel.setText("First Name:");
		displayPanel.add(firstNameLabel);
		displayPanel.add(firstNameTextField);

		lastNameLabel.setText("Last Name:");
		displayPanel.add(lastNameLabel);
		displayPanel.add(lastNameTextField);
		add(displayPanel);

		insertButton.setText("Insert New Entry");
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					insertButtonActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}); // end call to addActionListener

		add(insertButton);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				personQueries.close(); // close database connection
			}
		}); // end call to addWindowListener

		setVisible(true);
	} // end constructor

	// handles call when insertButton is clicked
	private void insertButtonActionPerformed(ActionEvent evt) throws SQLException {
		int result = personQueries.addNewAuthor(firstNameTextField.getText(), lastNameTextField.getText());

		if (result == 1) {
			JOptionPane.showMessageDialog(this, "Author added!", "Author added", JOptionPane.PLAIN_MESSAGE);
			this.dispose();
		} else {
			JOptionPane.showMessageDialog(this, "Author not added!", "Error", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
