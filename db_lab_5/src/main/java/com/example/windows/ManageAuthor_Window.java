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
import com.example.model.Author;

public class ManageAuthor_Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private Author author;
	private AuthorQueries personQueries;
	private JLabel firstNameLabel;
	private JTextField firstNameTextField;
	private JLabel idLabel;
	private JTextField idTextField;
	private JLabel lastNameLabel;
	private JTextField lastNameTextField;
	private JTextField maxTextField;
	private JPanel displayPanel;
	private JButton updateButton;
	private JButton deleteButton;


	public ManageAuthor_Window(int authorID) throws SQLException {
		super("Manage Author");

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
		updateButton = new JButton();
		deleteButton = new JButton();

		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		// setSize(400, 355);
		// setResizable(false);

		maxTextField.setHorizontalAlignment(JTextField.CENTER);
		maxTextField.setEditable(false);

		displayPanel.setLayout(new GridLayout(5, 2, 4, 4));

		idLabel.setText("Author ID:");
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

		updateButton.setText("Update Entry");
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					updateButtonActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}); // end call to addActionListener

		add(updateButton);
		
		deleteButton.setText("Delete Entry");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					deleteButtonActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}); // end call to addActionListener

		add(deleteButton);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				personQueries.close(); // close database connection
			}
		}); // end call to addWindowListener

		author = personQueries.getAuthorByID(authorID);
		if (author.getFirstName() != null) {
			idTextField.setText("" + author.getAuthorID());
			firstNameTextField.setText(author.getFirstName());
			lastNameTextField.setText(author.getLastName());
		} else {
			throw new SQLException("Cannot find any entries!");
		}
	} // end constructor

	// handles call when insertButton is clicked
	private void updateButtonActionPerformed(ActionEvent evt) throws SQLException {
		int result = personQueries.updateAuthor(firstNameTextField.getText(), lastNameTextField.getText(), Integer.parseInt(idTextField.getText()));

		if (result == 1) {
			JOptionPane.showMessageDialog(this, "Author updated!", "Author updated", JOptionPane.PLAIN_MESSAGE);
			this.dispose();
		} else {
			JOptionPane.showMessageDialog(this, "Author not updated!", "Error", JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	private void deleteButtonActionPerformed(ActionEvent evt) throws SQLException {
		int result = personQueries.deleteAuthor(Integer.parseInt(idTextField.getText()));

		if (result == 1) {
			JOptionPane.showMessageDialog(this, "Author deleted!", "Author deleted", JOptionPane.PLAIN_MESSAGE);
			this.dispose();
		} else {
			JOptionPane.showMessageDialog(this, "Author not deleted!", "Error", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
